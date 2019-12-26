package com.example.android.android_afriware.ui.splash


import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.android.android_afriware.R
import com.example.android.android_afriware.databinding.FragmentSplashScreenBinding

/**
 * A simple [Fragment] subclass.
 */
class SplashScreenFragment : Fragment() {

    // Timer for loading this splash screen
    private val SPLASH_TIME_OUT: Long = 3000
    private lateinit var binding: FragmentSplashScreenBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSplashScreenBinding.inflate(inflater, container, false)
        Handler().postDelayed({
            view?.let {
                Navigation.findNavController(it)
                    .navigate(R.id.action_splashScreenFragment_to_homeFragment)
            }
        }, SPLASH_TIME_OUT)
        return binding.root
    }
}
