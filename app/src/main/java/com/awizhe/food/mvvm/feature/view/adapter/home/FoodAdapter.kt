package com.awizhe.food.mvvm.feature.view.adapter.home

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.awizhe.food.databinding.FoodItemBinding
import com.awizhe.food.model.home.FoodPresentation
import com.awizhe.food.util.loadUrl

class FoodAdapter(
    val listener: mOnItemClickListener,
    private val foodList: MutableList<FoodPresentation>
) : RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {


    inner class FoodViewHolder(private val binding: FoodItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("NewApi", "SetTextI18n")
        fun bind(foodItem: FoodPresentation) =
            with(itemView) {

                binding.textFoodName.text = foodItem.foodname
                binding.imageFood.loadUrl(foodItem.foodimage!!)

                setOnClickListener {
                }


            }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val binding =
            FoodItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FoodViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) =
        holder.bind(foodList[position])

    override fun getItemCount() = foodList.size
}

interface mOnItemClickListener {
    fun onItemClick()
}