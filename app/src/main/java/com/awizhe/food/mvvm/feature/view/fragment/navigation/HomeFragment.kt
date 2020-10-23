package com.awizhe.food.mvvm.feature.view.fragment.navigation


import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.awizhe.food.R
import com.awizhe.food.databinding.FragmentHomeBinding
import com.awizhe.food.model.home.FoodPresentation
import com.awizhe.food.model.home.SliderItem
import com.awizhe.food.mvvm.feature.view.adapter.home.FoodAdapter
import com.awizhe.food.mvvm.feature.view.adapter.home.SliderAdapter
import com.awizhe.food.mvvm.feature.view.adapter.home.mOnItemClickListener
import com.awizhe.food.mvvm.viewModel.home.FoodViewModel
import com.awizhe.food.util.isOnline
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType
import com.smarteist.autoimageslider.SliderAnimations
import com.smarteist.autoimageslider.SliderView
import dagger.android.support.DaggerFragment
import javax.inject.Inject


class HomeFragment : DaggerFragment(), mOnItemClickListener {

    private lateinit var adapter: FoodAdapter

    private lateinit var binding: FragmentHomeBinding
    private lateinit var sliderAdapter: SliderAdapter
    private val sliderItemList: MutableList<SliderItem> = ArrayList()


    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel: FoodViewModel by lazy {
        ViewModelProvider(requireActivity(), viewModelFactory).get(FoodViewModel::class.java)
    }


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


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (requireContext().isOnline()) viewModel.getUserList() else showError(getString(R.string.check_internet))

        setUpObserver()

    }

    private fun setUpRecyclerview() {
        val layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        binding.recyclerAllFood.layoutManager = layoutManager
        binding.recyclerAllFood.setHasFixedSize(true)
    }

    private fun initAdapter(data: MutableList<FoodPresentation>) {
        setUpRecyclerview()
        adapter = FoodAdapter(this, data)
        binding.recyclerAllFood.adapter = adapter


    }


    private fun setUpObserver() {
        viewModel.foodList.observe(viewLifecycleOwner, Observer { mutableViewModelModel ->

            when {
                mutableViewModelModel.isLoading() -> {
                    showLoading()
                    hideEmptyListError()
                }
                mutableViewModelModel.getThrowable() != null -> {
                    hideLoading()
                    hideEmptyListError()
                    mutableViewModelModel.getThrowable()!!.message?.let {
                        showToastError()
                    }
                }
                else -> {
                    hideLoading()
                    hideEmptyListError()
                    val data = mutableViewModelModel.getData()


                    if (data?.foodList?.isNotEmpty()!!) {
                        initAdapter(data.foodList)
                    } else {
                        showEmptyListError()
                    }
                }
            }
        })
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        sliderAdapter = SliderAdapter(getSliderItem())
        sliderConfig()


    }

    private fun sliderConfig() {
        binding.imageSlider.setSliderAdapter(sliderAdapter)
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

    private fun showError(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    private fun showLoading() {
        binding.progressBar.visibility = View.VISIBLE
    }

    private fun hideLoading() {
        binding.progressBar.visibility = View.GONE
    }

    private fun showEmptyListError() {
        binding.errorView.visibility = View.VISIBLE
    }

    private fun hideEmptyListError() {
        binding.errorView.visibility = View.GONE
    }

    private fun showToastError() =
        Toast.makeText(context, getString(R.string.error_fetching_data), Toast.LENGTH_SHORT).show()

    override fun onItemClick() {
        TODO("Not yet implemented")
    }
}