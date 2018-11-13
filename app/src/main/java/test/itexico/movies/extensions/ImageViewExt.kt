package test.itexico.movies.extensions

import android.util.Log
import android.widget.ImageView
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import java.lang.Exception

/**
 * Created by hugo on 11/11/18.
 */
fun ImageView.loadImage(imageUrl: String, imagePlaceholder: Int) {
    Picasso.get()
            .load(imageUrl)
            .placeholder(imagePlaceholder)
            .into(this, object : Callback {
                override fun onSuccess() {
                    Log.d("success", "success")
                }

                override fun onError(e: Exception?) {
                    Log.d("error", "error")
                }

            })
}