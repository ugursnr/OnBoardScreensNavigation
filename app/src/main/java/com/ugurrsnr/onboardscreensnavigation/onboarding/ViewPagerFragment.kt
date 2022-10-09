package com.ugurrsnr.onboardscreensnavigation.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ugurrsnr.onboardscreensnavigation.databinding.FragmentViewPagerBinding
import com.ugurrsnr.onboardscreensnavigation.onboarding.screens.FirstScreen
import com.ugurrsnr.onboardscreensnavigation.onboarding.screens.SecondScreen
import com.ugurrsnr.onboardscreensnavigation.onboarding.screens.ThirdScreen


class ViewPagerFragment : Fragment() {
    private var _binding : FragmentViewPagerBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentViewPagerBinding.inflate(layoutInflater,container,false)

        val fragmentList = arrayListOf<Fragment>(
            FirstScreen(),
            SecondScreen(),
            ThirdScreen()
        )
        val adapterM= ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )
        binding.viewPager.adapter = adapterM
        return binding.root
    }


}