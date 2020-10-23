package com.awizhe.food.mvvm.feature.view.adapter.home

import android.view.LayoutInflater
import android.view.ViewGroup
import com.awizhe.food.databinding.SliderItemBinding
import com.awizhe.food.model.home.SliderItem
import com.awizhe.food.util.loadUrl
import com.smarteist.autoimageslider.SliderViewAdapter


class SliderAdapter(private var sliderItemList: MutableList<SliderItem>) :
    SliderViewAdapter<SliderAdapter.SliderAdapterVH>() {


    fun renewItems(sliderItems: MutableList<SliderItem>) {
        sliderItemList = sliderItems
        notifyDataSetChanged()
    }

    fun deleteItem(position: Int) {
        sliderItemList.removeAt(position)
        notifyDataSetChanged()
    }

    fun addItem(sliderItem: SliderItem?) {
        sliderItemList.add(sliderItem!!)
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup?) =
        SliderAdapterVH(
            SliderItemBinding.inflate(
                LayoutInflater.from(parent?.context),
                parent,
                false
            )
        )


    override fun getCount() = sliderItemList.size

    override fun onBindViewHolder(viewHolder: SliderAdapterVH?, position: Int) {
        viewHolder?.bind(sliderItemList[position])
    }

    class SliderAdapterVH(private val binding: SliderItemBinding) : ViewHolder(binding.root) {

        fun bind(sliderItem: SliderItem) =
            with(itemView) {
                binding.imageSlider.loadUrl(sliderItem.foodImageUrl)
                binding.textSlider.text = sliderItem.foodName

//                setOnClickListener {
//                    listener(SliderItem(sliderItem.foodImageUrl, sliderItem.foodName))
//                }
            }
    }
}