package com.godslew.gkcoffeescrollviewpager2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class FragmentAdapter(
    fragmentActivity: FragmentActivity,
    private val pages: List<PageType>
) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return pages.size
    }

    override fun createFragment(position: Int): Fragment {
        return when (pages[position]) {
            PageType.GRANDE -> {
                GrandeFragment()
            }
            PageType.TALL -> {
                TallFragment()
            }
            PageType.MEDIUM -> {
                MediumFragment()
            }
            PageType.SMALL -> {
                SmallFragment()
            }
        }
    }
    interface OnChangeTitleListener {
        fun onChangeTitle(title : String)
    }
}


