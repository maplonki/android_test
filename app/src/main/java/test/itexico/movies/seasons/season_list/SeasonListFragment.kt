package test.itexico.movies.seasons.season_list

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import test.itexico.movies.R
import test.itexico.movies.extensions.inflate
import test.itexico.movies.model.Season
import test.itexico.movies.season_list.SeasonListContract
import test.itexico.movies.seasons.SeasonRepositoryLocal

/**
 * Created by hugo on 11/11/18.
 */
class SeasonListFragment : Fragment(), SeasonListContract.View {


    private val seasonListPresenter: SeasonListPresenter = SeasonListPresenter(SeasonRepositoryLocal(), this)

    companion object {
        fun newInstance() = SeasonListFragment()
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return container?.inflate(R.layout.fragment_season_list) ?: throw RuntimeException("Unable to create view for layout ${R.layout.fragment_season_list}")
    }

    /**
     * SeasonListContract.View
     */
    override fun showSeasonList(seasons: List<Season>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showLoading(isLoading: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showSeasonDetail(seasonId: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}