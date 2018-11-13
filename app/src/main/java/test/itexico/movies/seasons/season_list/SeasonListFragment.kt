package test.itexico.movies.seasons.season_list

import android.app.Fragment
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import kotlinx.android.synthetic.main.fragment_season_list.*
import test.itexico.movies.R
import test.itexico.movies.extensions.inflate
import test.itexico.movies.model.Season
import test.itexico.movies.season_list.SeasonListContract
import test.itexico.movies.seasons.SeasonRepositoryLocal
import test.itexico.movies.seasons.season_detail.SeasonDetailFragment

/**
 * Created by hugo on 11/11/18.
 */
class SeasonListFragment : Fragment(), SeasonListContract.View {

    companion object {
        fun newInstance() = SeasonListFragment()
    }

    private val seasonListPresenter: SeasonListPresenter = SeasonListPresenter(SeasonRepositoryLocal(), this)

    private val recyclerView: RecyclerView by lazy { season_list_recyclerview }
    private val progressbar: ProgressBar by lazy { season_list_pb_loading }

    private val recyclerViewAdapter: SeasonListAdapter = SeasonListAdapter { season, _ ->
        seasonListPresenter.openSeasonDetail(season.seasonId)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return container?.inflate(R.layout.fragment_season_list) ?: throw RuntimeException("Unable to create view for layout ${R.layout.fragment_season_list}")
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView.apply {
            setHasFixedSize(true)
            adapter = recyclerViewAdapter

            val layoutManager = GridLayoutManager(activity, 2)
            setLayoutManager(layoutManager)
        }
    }

    override fun onResume() {
        super.onResume()
        seasonListPresenter.loadSeasonList()
    }

    /**
     * SeasonListContract.View
     */
    override fun showSeasonList(seasons: List<Season>) {
        recyclerViewAdapter.setItems(seasons)
    }

    override fun showLoading(isLoading: Boolean) {
        progressbar.visibility = if (isLoading) View.VISIBLE else View.INVISIBLE
    }

    override fun showSeasonDetail(seasonId: Long) {
        activity.fragmentManager.beginTransaction()
                .add(R.id.fragment_container, SeasonDetailFragment.newInstance(seasonId))
                .addToBackStack(null)
                .commit()
    }
}