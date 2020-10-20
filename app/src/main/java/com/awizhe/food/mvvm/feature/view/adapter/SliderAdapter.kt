package com.awizhe.food.mvvm.feature.view.adapter

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.awizhe.food.R
import com.smarteist.autoimageslider.SliderViewAdapter


public class SliderAdapter : SliderViewAdapter<SliderAdapter.SliderAdapterVH>() {


    class SliderAdapterVH(itemView: View) : ViewHolder(itemView) {
        lateinit var itemView: View
        var imageViewBackground: ImageView = itemView.findViewById(R.id.iv_auto_image_slider)
        var imageGifContainer: ImageView = itemView.findViewById(R.id.iv_gif_container)
        var textViewDescription: TextView = itemView.findViewById(R.id.tv_auto_image_slider)

        init {
            this.itemView = itemView
        }
    }

    override fun getCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onCreateViewHolder(parent: ViewGroup?): SliderAdapterVH {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(viewHolder: SliderAdapterVH?, position: Int) {
        TODO("Not yet implemented")
    }
}