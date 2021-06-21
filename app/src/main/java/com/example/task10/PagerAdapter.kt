package com.example.task10

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class PagerAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle
) : FragmentStateAdapter(
    fragmentManager, lifecycle
) {


    private val listOfFragment = listOf(ViewFragment(), EditFragment())

    override fun getItemCount(): Int {
        if (listOfFragment.size != 0) {
            return listOfFragment.size
        }
    }

    override fun createFragment(position: Int): Fragment = listOfFragment[position]
}