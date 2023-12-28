package com.example.view_pager_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.jetbrains.annotations.Nullable


class Page1 : Fragment() {




override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

}

    // This method is responsible for inflating (parsing) the respective XML file
    //and return the view which is added to the ViewPager adapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_page1, container, false)
    }
}