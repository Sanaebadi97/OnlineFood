package com.awizhe.food.mvvm.feature.view.adapter

import android.view.ViewGroup
import com.awizhe.food.databinding.SliderItemBinding
import com.awizhe.food.model.SliderItem
import com.awizhe.food.util.loadUrl
import com.smarteist.autoimageslider.SliderViewAdapter


public class SliderAdapter : SliderViewAdapter<SliderAdapter.SliderAdapterVH>() {


    private var mSliderItems: MutableList<SliderItem> = ArrayList()

    fun renewItems(sliderItems: MutableList<SliderItem>) {
        this.mSliderItems = sliderItems
        notifyDataSetChanged()
    }

    fun deleteItem(position: Int) {
        this.mSliderItems.removeAt(position)
        notifyDataSetChanged()
    }

    fun addItem(sliderItem: SliderItem?) {
        this.mSliderItems.add(sliderItem!!)
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup?): SliderAdapterVH {
        TODO("Not yet implemented")
    }


    override fun getCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(viewHolder: SliderAdapterVH?, position: Int) {
        TODO("Not yet implemented")
    }

    class SliderAdapterVH(private val binding: SliderItemBinding) : ViewHolder(binding.root) {

        fun bind(sliderItem: SliderItem, listener: (SliderItem) -> Unit) =
            with(itemView) {
                binding.imageSlider.loadUrl(sliderItem.foodImageUrl)
                binding.textSlider.text = sliderItem.foodName

                setOnClickListener {
                    listener(SliderItem(sliderItem.foodImageUrl, sliderItem.foodName))
                }
            }
    }
}