package test.itexico.movies.extensions

import android.widget.TextView

/**
 * Created by hugo on 11/11/18.
 */
fun TextView.textWithResource(stringRes: Int, stringParam: String? = null) {
    val string = context.getString(stringRes)

    val formattedString: String = if (stringParam != null) {
        String.format(string, stringParam)
    } else {
        string
    }

    text = formattedString
}