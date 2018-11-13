package test.itexico.movies.seasons.season_detail

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import test.itexico.movies.R
import test.itexico.movies.base.BaseListAdapter
import test.itexico.movies.extensions.inflate
import test.itexico.movies.model.Episodes

/**
 * Created by hugo on 11/12/18.
 */
class EpisodeListAdapter(itemList: List<Episodes> = listOf())
    : BaseListAdapter<Episodes, EpisodeListAdapter.ViewHolder>(itemList) {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = parent?.inflate(R.layout.list_item_episode) ?: throw RuntimeException("")
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val episode = itemList[position]

        holder?.apply {
            tvEpisode.text = episode.episodeNumber.toString()
            tvName.text = episode.episodeName

        }
    }

    inner class ViewHolder(view: View) : BaseViewHolder(view) {
        val tvEpisode = view.findViewById(R.id.item_episode_tv_number) as TextView
        val tvName = view.findViewById(R.id.item_episode_tv_name) as TextView
    }
}
