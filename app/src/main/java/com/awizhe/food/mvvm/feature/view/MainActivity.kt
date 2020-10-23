package com.awizhe.food.mvvm.feature.view

import android.os.Bundle
import android.view.Gravity
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.awizhe.food.R
import com.awizhe.food.databinding.ActivityMainBinding

private lateinit var navController: NavController
private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)

        navController = Navigation.findNavController(this, R.id.nav_host_fragment)
        binding.navigationView.setupWithNavController(navController)

        binding.mainToolbar.imageMenu.setOnClickListener {

            binding.drawerLayout.openDrawer(Gravity.RIGHT)

        }


    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController, null)
    }

    override fun onBackPressed() {
        binding.drawerLayout.closeDrawer(Gravity.RIGHT)
        super.onBackPressed()
    }
}