package test.itexico.movies.model

/**
 * Created by hugo on 11/11/18.
 */
class Season(var seasonId: Long,
             var name: String,
             var episodes: Int,
             var rating: Float,
             var image: String = "ff",
             var imageCover: String = "fff",
             var seasonNumber: Int = 0,
             var seasonEpisodes: List<Episodes> = listOf())


class Episodes(
        var episodeId: Long,
        var episodeNumber: Int,
        var episodeName: String)
