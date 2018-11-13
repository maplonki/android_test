package test.itexico.movies.seasons

import test.itexico.movies.model.Episodes
import test.itexico.movies.model.Season

/**
 * Created by hugo on 11/11/18.
 */

class SeasonRepositoryLocal : SeasonRepository {

    override fun getSeasonList(showName: String): List<Season> {
        val episodeList = listOf(
                Episodes(0, 1, "Winter is coming"),
                Episodes(0, 2, "The kings road"),
                Episodes(0, 3, "Lord Snow")
        )
        return listOf(
                Season(1, "Season 1", 15, 9.1f, "http://image.tmdb.org/t/p/w500/zwaj4egrhnXOBIit1tyb4Sbt3KP.jpg",
                        seasonEpisodes = episodeList),
                Season(2, "Season 2", 12, 8.0f, "http://image.tmdb.org/t/p/w500/5tuhCkqPOT20XPwwi9NhFnC1g9R.jpg",
                        seasonEpisodes = episodeList),
                Season(3, "Season 3", 9, 8.8f, "http://image.tmdb.org/t/p/w500/7d3vRgbmnrRQ39Qmzd66bQyY7Is.jpg",
                        seasonEpisodes = episodeList),
                Season(4, "Season 4", 13, 9.2f, "http://image.tmdb.org/t/p/w500/dniQ7zw3mbLJkd1U0gdFEh4b24O.jpg",
                        seasonEpisodes = episodeList),
                Season(5, "Season 5", 12, 8.4f, "http://image.tmdb.org/t/p/w500/527sR9hNDcgVDKNUE3QYra95vP5.jpg",
                        seasonEpisodes = episodeList)
        )
    }

    override fun getSeasonDetail(seasonId: Long): Season {

        val episodeList = listOf(
                Episodes(0, 1, "Winter is coming"),
                Episodes(1, 2, "The kings road"),
                Episodes(2, 3, "Lord Snow")
        )
        return listOf(
                Season(1, "Season 1", 15, 9.1f, "http://image.tmdb.org/t/p/w500/zwaj4egrhnXOBIit1tyb4Sbt3KP.jpg",
                        seasonEpisodes = episodeList),
                Season(2, "Season 2", 12, 8.0f, "http://image.tmdb.org/t/p/w500/5tuhCkqPOT20XPwwi9NhFnC1g9R.jpg",
                        seasonEpisodes = episodeList),
                Season(3, "Season 3", 9, 8.8f, "http://image.tmdb.org/t/p/w500/7d3vRgbmnrRQ39Qmzd66bQyY7Is.jpg",
                        seasonEpisodes = episodeList),
                Season(4, "Season 4", 13, 9.2f, "http://image.tmdb.org/t/p/w500/dniQ7zw3mbLJkd1U0gdFEh4b24O.jpg",
                        seasonEpisodes = episodeList),
                Season(5, "Season 5", 12, 8.4f, "http://image.tmdb.org/t/p/w500/527sR9hNDcgVDKNUE3QYra95vP5.jpg",
                        seasonEpisodes = episodeList)
        ).single { it.seasonId == seasonId }
    }

}