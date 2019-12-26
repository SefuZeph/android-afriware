package com.example.android.android_afriware.ui.ladies


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.android.android_afriware.databinding.FragmentLadiesBinding

/**
 * Kitenge fashion for the ladies will be reflected here
 */
class LadiesFragment : Fragment() {

    private lateinit var binding: FragmentLadiesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLadiesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }
}
