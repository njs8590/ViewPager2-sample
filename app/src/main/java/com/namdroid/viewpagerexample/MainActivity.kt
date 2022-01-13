package com.namdroid.viewpagerexample

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var modelList = ArrayList<MyPagerViewModel>()
        modelList.add(MyPagerViewModel(R.drawable.bear, "안녕하세요 !"))
        modelList.add(MyPagerViewModel(R.drawable.cat, "행복하세요 !"))
        modelList.add(MyPagerViewModel(R.drawable.bull, "건강하세요 !"))

        var myPagerAdapter = MyPagerAdapter(modelList)

        val wormDotsIndicator = findViewById<WormDotsIndicator>(R.id.worm_dots_indicator)

        myviewpager.apply{
            adapter = myPagerAdapter
            wormDotsIndicator.setViewPager2(this)
        }

    }
}