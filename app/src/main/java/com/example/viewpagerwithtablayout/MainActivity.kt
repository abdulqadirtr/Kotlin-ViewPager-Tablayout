package com.example.viewpagerwithtablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.koc.kocailem.market.ui.main.adapter.BannerViewPagerAdapter

class MainActivity : AppCompatActivity() {


    //var kocmarketBannerViewPagerAdapter  KocmarketBannerViewPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter = BannerViewPagerAdapter(this)
        var tabDots : TabLayout = findViewById(R.id.tabDots)
        var bannerKocMarket : ViewPager =findViewById(R.id.bannerKocMarket)
        bannerKocMarket.adapter = adapter
        tabDots.setupWithViewPager(bannerKocMarket, true)
    }
}