package com.ugurrsnr.onboardscreensnavigation

import android.content.Context
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController


class SplashFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        Handler().postDelayed({

            if ( onBoardingFinished()){
                findNavController().navigate(SplashFragmentDirections.actionSplashFragmentToHomeFragment())
            }else {
                findNavController().navigate(SplashFragmentDirections.actionSplashFragmentToViewPagerFragment())

            }
        },2000)

        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    private fun onBoardingFinished() : Boolean{
        val sharedPref= requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        return sharedPref.getBoolean("Finished", false)
    }


}