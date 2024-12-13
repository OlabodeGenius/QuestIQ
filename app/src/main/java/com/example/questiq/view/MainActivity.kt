package com.example.questiq.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.example.questiq.R
import com.example.questiq.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

         val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.navHostFragmentContainerView) as NavHostFragment
        navController  = navHostFragment.navController

    }

//    override fun onSupportNavigateUp(): Boolean {
//
//        navController = findNavController(R.id.navHostFragmentContainerView)
//        return navController.navigateUp() || super.onSupportNavigateUp()
//    }


}