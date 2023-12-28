package com.example.view_pager_fragment


import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity){

    private val fragmenmts = ArrayList<Fragment>()
    val fragmentsTitle = ArrayList<String>()

    fun add(fragment: Fragment, title: String){
        fragmenmts.add(fragment)
        fragmentsTitle.add(title)
    }

    override fun getItemCount(): Int {
        return fragmenmts.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmenmts[position]
    }

    fun getPageTitle(position: Int): CharSequence? = fragmentsTitle[position]

}