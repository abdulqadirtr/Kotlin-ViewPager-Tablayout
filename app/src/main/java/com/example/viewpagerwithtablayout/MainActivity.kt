package com.example.viewpagerwithtablayout

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import androidx.viewpager.widget.ViewPager.OnPageChangeListener
import com.google.android.material.tabs.TabLayout


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter = BannerViewPagerAdapter(this)
        var tabDots : TabLayout = findViewById(R.id.tabDots)
        var bannerMarket : ViewPager =findViewById(R.id.bannerKocMarket)
        bannerMarket.adapter = adapter
        tabDots.setupWithViewPager(bannerMarket, true)

        bannerMarket.addOnPageChangeListener(object : OnPageChangeListener {

            override fun onPageScrollStateChanged(state: Int) {
            }
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

            }
            override fun onPageSelected(position: Int) {
                Toast.makeText(this@MainActivity,  bannerMarket.currentItem.toString(), Toast.LENGTH_SHORT).show()
            }
        })

    }
}