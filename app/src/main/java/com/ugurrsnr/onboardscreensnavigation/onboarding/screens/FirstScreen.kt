package com.ugurrsnr.onboardscreensnavigation.onboarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.ugurrsnr.onboardscreensnavigation.R
import com.ugurrsnr.onboardscreensnavigation.databinding.FragmentFirstBinding


class FirstScreen : Fragment() {
    private var _binding : FragmentFirstBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstBinding.inflate(layoutInflater,container,false)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        binding.next1.setOnClickListener {
            viewPager?.currentItem = 1 //first screen is 0 so when clicked next we increase the number

        }
        return binding.root
    }


}