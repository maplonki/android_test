package test.itexico.movies

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import test.itexico.movies.seasons.season_list.SeasonListFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragmentManager.beginTransaction()
                .add(R.id.fragment_container, SeasonListFragment.newInstance())
                .commit()
    }
}
