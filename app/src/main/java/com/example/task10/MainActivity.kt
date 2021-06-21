package com.example.task10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.task10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding: ActivityMainBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.viewPager.adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}