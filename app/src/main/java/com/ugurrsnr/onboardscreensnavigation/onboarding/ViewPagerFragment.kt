package com.ugurrsnr.onboardscreensnavigation.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.ugurrsnr.onboardscreensnavigation.R
import com.ugurrsnr.onboardscreensnavigation.databinding.FragmentViewPagerBinding
import com.ugurrsnr.onboardscreensnavigation.onboarding.screens.FirstFragment
import com.ugurrsnr.onboardscreensnavigation.onboarding.screens.SecondFragment
import com.ugurrsnr.onboardscreensnavigation.onboarding.screens.ThirdFragment


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
            FirstFragment(),
            SecondFragment(),
            ThirdFragment()
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