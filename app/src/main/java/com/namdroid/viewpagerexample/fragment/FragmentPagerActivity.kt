package com.namdroid.viewpagerexample.fragment

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.namdroid.viewpagerexample.MyPagerAdapter
import com.namdroid.viewpagerexample.MyPagerViewModel
import com.namdroid.viewpagerexample.R
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_viewpager.*

class FragmentPagerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewpager_fragment)

        var fragmentViewPager = findViewById<ViewPager2>(R.id.fragment_viewPager)
        fragmentViewPager.adapter = ScreenSlidePagerAdapter(this)
        fragmentViewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL

    }

    /**
     * A simple pager adapter that represents 5 ScreenSlidePageFragment objects, in
     * sequence.
     */
    private inner class ScreenSlidePagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
        var NUM_PAGES = 3

        override fun getItemCount(): Int = NUM_PAGES

        override fun createFragment(position: Int): Fragment {
            return when(position){
                0 -> Fragment1()
                1 -> Fragment2()
                else -> Fragment3()
            }
        }
    }
}