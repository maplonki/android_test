package test.itexico.movies.seasons

import test.itexico.movies.model.Season

/**
 * Created by hugo on 11/11/18.
 */
interface SeasonRepository {
    fun getSeasonList(showName: String): List<Season>
    fun getSeasonDetail(seasonId: Long): Season
}