package com.namdroid.viewpagerexample

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.viewpager.widget.ViewPager
import com.namdroid.viewpagerexample.fragment.FragmentPagerActivity
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn_view = findViewById<Button>(R.id.btn_view)
        var btn_fragment = findViewById<Button>(R.id.btn_fragment)

        btn_view.setOnClickListener{
            val intent = Intent(this@MainActivity, PagerActivity::class.java)
            startActivity(intent)
        }

        btn_fragment.setOnClickListener{
            val intent = Intent(this@MainActivity, FragmentPagerActivity::class.java)
            startActivity(intent)
        }

    }
}