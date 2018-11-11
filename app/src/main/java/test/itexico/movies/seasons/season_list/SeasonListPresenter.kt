package test.itexico.movies.seasons.season_list

import test.itexico.movies.AppConfig
import test.itexico.movies.season_list.SeasonListContract
import test.itexico.movies.seasons.SeasonRepository

/**
 * Created by hugo on 11/11/18.
 */
class SeasonListPresenter(
        val seasonRepository: SeasonRepository,
        val seasonListView: SeasonListContract.View,
        val showName: String = AppConfig.SHOW_NAME
) : SeasonListContract.ActionListener {

    override fun loadSeasonList() {
        seasonListView.showLoading(true)
        val seasonList = seasonRepository.getSeasonList(showName)
        seasonListView.showLoading(false)
        seasonListView.showSeasonList(seasonList)
    }

    override fun openSeasonDetail(seasonId: Long) {
        seasonListView.showSeasonDetail(seasonId)
    }

}