package test.itexico.movies.extensions

import android.widget.ImageView
import com.squareup.picasso.Picasso

/**
 * Created by hugo on 11/11/18.
 */
fun ImageView.loadImage(imageUrl: String, imagePlaceholder: Int) {
    Picasso.get()
            .load(imageUrl)
            .placeholder(imagePlaceholder)
            .into(this)
}