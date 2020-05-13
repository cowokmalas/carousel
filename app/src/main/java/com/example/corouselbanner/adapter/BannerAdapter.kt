package com.example.corouselbanner.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.corouselbanner.R
import com.example.corouselbanner.model.BannerModel
import kotlinx.android.synthetic.main.item_banner.view.*

class BannerAdapter(private val bannerListItem: List<BannerModel>):RecyclerView.Adapter<BannerAdapter.BannerViewHolder>(){

    class BannerViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
        val imgBaner=itemView.findViewById<ImageView>(R.id.img_banner)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BannerAdapter.BannerViewHolder {
        val view:View=LayoutInflater.from(parent.context).inflate(R.layout.item_banner,parent,false)
        return BannerViewHolder(view)
    }

    override fun getItemCount(): Int {
        return bannerListItem.size
    }

    override fun onBindViewHolder(holder: BannerAdapter.BannerViewHolder, position: Int) {
        val bannerItem=bannerListItem[position]
        Glide.with(holder.itemView.context)
            .load(bannerItem.imgPhot)
            .into(holder.imgBaner)
        holder.itemView.tv_title.text=bannerItem.title
        holder.itemView.tv_description.text=bannerItem.description

    }

}