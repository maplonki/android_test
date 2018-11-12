package test.itexico.movies.seasons

import test.itexico.movies.model.Season

/**
 * Created by hugo on 11/11/18.
 */

class SeasonRepositoryLocal : SeasonRepository {

    override fun getSeasonList(showName: String): List<Season> {
        return listOf(
                Season(1, "Season 1", 15, 9.1f),
                Season(2, "Season 2", 12, 8.0f),
                Season(3, "Season 3", 9, 8.8f),
                Season(4, "Season 4", 13, 9.2f),
                Season(5, "Season 5", 12, 8.4f)
        )
    }

    override fun getSeasonDetail(seasonId: Long): Season {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}