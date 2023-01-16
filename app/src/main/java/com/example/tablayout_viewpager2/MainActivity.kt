package com.example.tablayout_viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)
        pagerTest.adapter = adapter
        TabLayoutMediator(tabDemo,pagerTest){
                tab,pos ->
            when(pos){
                0-> {tab.text = "Tab 1"}
                1-> {tab.text = "Tab 2"}
                2-> {tab.text = "Tab 3"}
                3-> {tab.text = "Tab 4"}
            }
        }.attach()
    }
}