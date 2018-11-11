package test.itexico.movies.extensions

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by hugo on 11/11/18.
 */
fun ViewGroup.inflate(layoutRes: Int, attachToParent: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutRes, this, attachToParent)
}