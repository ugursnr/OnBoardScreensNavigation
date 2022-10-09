package com.ugurrsnr.onboardscreensnavigation.onboarding.screens

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.ugurrsnr.onboardscreensnavigation.R
import com.ugurrsnr.onboardscreensnavigation.databinding.FragmentThirdBinding
import com.ugurrsnr.onboardscreensnavigation.onboarding.ViewPagerFragmentDirections


class ThirdScreen : Fragment() {
    private var _binding : FragmentThirdBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentThirdBinding.inflate(layoutInflater, container, false)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)
        binding.finish.setOnClickListener {
            findNavController().navigate(ViewPagerFragmentDirections.actionViewPagerFragmentToHomeFragment())
            onBoardingFinished()
        }

        return binding.root
    }

    fun onBoardingFinished(){
        val sharedPref= requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("Finished", true)
        editor.apply()
    }


}