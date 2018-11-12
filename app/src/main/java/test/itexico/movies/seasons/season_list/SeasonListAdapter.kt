package test.itexico.movies.seasons.season_list

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import test.itexico.movies.R
import test.itexico.movies.base.BaseListAdapter
import test.itexico.movies.extensions.inflate
import test.itexico.movies.extensions.loadImage
import test.itexico.movies.extensions.textWithResource
import test.itexico.movies.model.Season

/**
 * Created by hugo on 11/11/18.
 */

class SeasonListAdapter(itemList: List<Season> = listOf(), clickListener: (Season, Int) -> Unit)
    : BaseListAdapter<Season, SeasonListAdapter.ViewHolder>(itemList, clickListener) {

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val season = itemList[position]

        holder?.apply {
            ivImage.loadImage(season.image,  R.drawable.season_background_placeholder)
            tvName.text = season.name
            tvEpisodes.textWithResource(R.string.season_list_tv_episodes, season.episodes.toString())
            tvRating.textWithResource(R.string.season_list_tv_rating, season.rating.toString())

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = parent?.inflate(R.layout.list_item_season) ?: throw RuntimeException("")
        return ViewHolder(view)
    }

    inner class ViewHolder(view: View) : BaseViewHolder(view) {
        val ivImage by lazy { view.findViewById(R.id.item_season_iv_image) as ImageView }
        val tvName by lazy { view.findViewById(R.id.item_season_tv_name) as TextView }
        val tvEpisodes by lazy { view.findViewById(R.id.item_season_tv_seasons) as TextView }
        val tvRating by lazy { view.findViewById(R.id.item_season_tv_rating) as TextView }

    }
}
