package test.itexico.movies.seasons.season_detail

import android.app.Fragment
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_season_detail.*
import test.itexico.movies.R
import test.itexico.movies.extensions.inflate
import test.itexico.movies.extensions.loadImage
import test.itexico.movies.extensions.textWithResource
import test.itexico.movies.model.Season
import test.itexico.movies.seasons.SeasonRepositoryLocal

/**
 * Created by hugo on 11/12/18.
 */
class SeasonDetailFragment : Fragment(), SeasonDetailContract.View {

    val seasonDetailPresenter: SeasonDetailPresenter = SeasonDetailPresenter(SeasonRepositoryLocal(), this)

    companion object {
        fun newInstance(seasonId: Long) = SeasonDetailFragment().apply {
            arguments = Bundle().apply {
                putLong("season_id", seasonId)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return container?.inflate(R.layout.fragment_season_detail) ?: throw RuntimeException("")
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val seasonId = arguments.getLong("season_id")
        seasonDetailPresenter.loadDetails(seasonId)

    }

    override fun showSeasonDetail(season: Season) {
        season_detail_tv_name.text = season.name
        season_detail_iv_thumb.loadImage(season.image, R.drawable.season_background_placeholder)
        season_detail_iv_cover.loadImage(season.image, R.drawable.season_background_placeholder)
        season_detail_tv_episodes.textWithResource(R.string.season_list_tv_episodes, season.episodes.toString())
        season_detail_tv_rating.text = season.rating.toString()


        season_detail_recyclerview.apply {
            setHasFixedSize(true)
            adapter = EpisodeListAdapter(season.seasonEpisodes)

            layoutManager = LinearLayoutManager(activity)
        }
    }
}