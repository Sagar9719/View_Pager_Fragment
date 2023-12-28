package com.example.view_pager_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var viewPagerAdapter: ViewPagerAdapter
    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.viewpager)

        //setting up the adapter
        viewPagerAdapter = ViewPagerAdapter(this)

        //add the fragments
        viewPagerAdapter.add(Page1(), "Page 1")
        viewPagerAdapter.add(Page2(), "Page 2")
        viewPagerAdapter.add(Page3(), "Page 3")

        //set the adapter
        viewPager.adapter = viewPagerAdapter

        // The Page (fragment) titles will be displayed in the
        // tabLayout hence we need to  set the page viewer

        tabLayout = findViewById(R.id.tab_layout)
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = viewPagerAdapter.fragmentsTitle[position]
        }.attach()
    }
}