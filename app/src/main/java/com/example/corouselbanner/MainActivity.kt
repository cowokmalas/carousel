package com.example.corouselbanner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.corouselbanner.adapter.BannerAdapter
import com.example.corouselbanner.model.bannerList
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vp2_baner.adapter = BannerAdapter(bannerList)
       // vp2_baner.offscreenPageLimit = 1
    }
}
