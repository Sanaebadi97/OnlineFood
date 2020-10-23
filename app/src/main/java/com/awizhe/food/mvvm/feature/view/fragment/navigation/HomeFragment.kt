package com.awizhe.food.mvvm.feature.view.fragment.navigation


import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.awizhe.food.databinding.FragmentHomeBinding
import com.awizhe.food.model.home.SliderItem
import com.awizhe.food.mvvm.feature.view.adapter.home.FoodAdapter
import com.awizhe.food.mvvm.feature.view.adapter.home.SliderAdapter
import com.awizhe.food.mvvm.feature.view.adapter.home.mOnItemClickListener
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType
import com.smarteist.autoimageslider.SliderAnimations
import com.smarteist.autoimageslider.SliderView
import dagger.android.support.DaggerFragment
import javax.inject.Inject


class HomeFragment : DaggerFragment() , mOnItemClickListener{

    private lateinit var adapter: FoodAdapter

    private lateinit var binding: FragmentHomeBinding
    private lateinit var sliderAdapter: SliderAdapter
    private val sliderItemList: MutableList<SliderItem> = ArrayList()


    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        sliderAdapter = SliderAdapter(getSliderItem())
        sliderConfig()


    }

    private fun sliderConfig() {
        binding.imageSlider.setSliderAdapter(sliderAdapter!!)
        binding.imageSlider.setIndicatorAnimation(IndicatorAnimationType.WORM) //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        binding.imageSlider.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION)
        binding.imageSlider.autoCycleDirection = SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH
        binding.imageSlider.indicatorSelectedColor = Color.WHITE
        binding.imageSlider.indicatorUnselectedColor = Color.GRAY
        binding.imageSlider.scrollTimeInSec = 4
        binding.imageSlider.isAutoCycle = true
        binding.imageSlider.startAutoCycle()


        binding.imageSlider.setOnIndicatorClickListener {
            Log.i(
                "GGG",
                "onIndicatorClicked: " + binding.imageSlider.currentPagePosition
            )
        }
    }

    private fun getSliderItem(): MutableList<SliderItem> {
        sliderItemList.add(
            SliderItem(
                "https://wallpapershome.com/images/pages/pic_h/954.jpg",
                "میگو پلو"
            )
        )
        sliderItemList.add(
            SliderItem(
                "https://wallpapershome.com/images/pages/ico_h/952.jpg",
                "قلیه ماهی"
            )
        )
        sliderItemList.add(
            SliderItem(
                "https://wallpapershome.com/images/pages/ico_h/815.jpg",
                "صدف و جلبک"
            )
        )
        sliderItemList.add(
            SliderItem(
                "https://wallpapershome.com/images/pages/ico_h/954.jpg",
                "خرچنگ آبپز"
            )
        )

        return sliderItemList
    }

    override fun onItemClick() {
        TODO("Not yet implemented")
    }
}