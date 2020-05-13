package com.example.corouselbanner.model

import android.icu.text.CaseMap
import com.example.corouselbanner.R
import java.io.FileDescriptor

data class BannerModel (
    val title: String="",
    val description:String="",
    val imgPhot:Int=0
)
val bannerList= listOf(
    BannerModel("Rupiah","Indonesia", R.drawable.indonesia),
    BannerModel("Ringgit","Malaysia",R.drawable.malaysia),
    BannerModel("Dollar Brunei Darussalam","Brunei Darussalam",R.drawable.brunei),
    BannerModel("Peso","Filipina",R.drawable.filipina),
    BannerModel("Riel","Kamboja",R.drawable.kamboja),
    BannerModel("New Kip","Laos",R.drawable.laos),
    BannerModel("Kyat","Myanmar",R.drawable.myanmar),
    BannerModel("Dollar Singapure","Singapure",R.drawable.singapure),
    BannerModel("Bath","Thailand",R.drawable.thailand),
    BannerModel("Dollar US","Timor Leste",R.drawable.timorleste),
    BannerModel("Dong","Vietna",R.drawable.vietnam)

)