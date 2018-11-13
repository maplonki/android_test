package test.itexico.movies.base

import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * Created by hugo on 11/11/18.
 */
abstract class BaseListAdapter<T, VH : BaseListAdapter<T, VH>.BaseViewHolder>(
        var itemList: List<T>,
        var itemClick: ((T, position: Int) -> Unit)? = null

) : RecyclerView.Adapter<VH>() {

    override fun getItemCount() = itemList.size

    fun setItems(items: List<T>) {
        itemList = items
        notifyDataSetChanged()
    }

    inner abstract class BaseViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        init {
            view.setOnClickListener {
                val position = adapterPosition
                itemClick?.invoke(itemList[position], position)
            }
        }
    }
}