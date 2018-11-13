package test.itexico.movies.seasons.season_detail

import test.itexico.movies.seasons.SeasonRepository

/**
 * Created by hugo on 11/12/18.
 */
class SeasonDetailPresenter(
        val seasonRepository: SeasonRepository,
        val seasonDetailView: SeasonDetailContract.View
) : SeasonDetailContract.ActionListener {


    override fun loadDetails(seasonId: Long) {
        val season = seasonRepository.getSeasonDetail(seasonId)
        seasonDetailView.showSeasonDetail(season)
    }
}