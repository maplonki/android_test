package test.itexico.movies.season_list

import test.itexico.movies.model.Season

/**
 * Created by hugo on 11/11/18.
 */
interface SeasonListContract {

    interface View {
        fun showSeasonList(seasons: List<Season>)
        fun showLoading(isLoading: Boolean)
        fun showSeasonDetail(seasonId: Long)
    }

    interface ActionListener {
        fun loadSeasonList()
        fun openSeasonDetail(seasonId: Long)

    }
}