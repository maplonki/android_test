package test.itexico.movies.seasons.season_detail

import test.itexico.movies.model.Season

/**
 * Created by hugo on 11/12/18.
 */
interface SeasonDetailContract {

    interface View {
        fun showSeasonDetail(season: Season)
    }

    interface ActionListener {
        fun loadDetails(seasonId: Long)

    }
}