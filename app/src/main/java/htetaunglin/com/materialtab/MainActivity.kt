package htetaunglin.com.materialtab

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import htetaunglin.com.materialtab.adapter.ViewPagerAdapter
import htetaunglin.com.materialtab.fragment.FirstFragment
import htetaunglin.com.materialtab.fragment.SecondFragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)
        toolbar.title = resources.getString(R.string.app_name)
        setupViewPager(viewpager)
        tabs.setupWithViewPager(viewpager)
    }


    private fun setupViewPager(viewPager: ViewPager) {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(FirstFragment(), "First")
        adapter.addFragment(SecondFragment(), "Second")
        viewPager.adapter = adapter
    }
}
