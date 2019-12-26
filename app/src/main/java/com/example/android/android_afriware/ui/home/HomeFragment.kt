package com.example.android.android_afriware.ui.home


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.android.android_afriware.adapters.TabPagerAdapter
import com.example.android.android_afriware.databinding.FragmentHomeBinding
import com.example.android.android_afriware.ui.gents.MensFragment
import com.example.android.android_afriware.ui.ladies.LadiesFragment
import com.google.android.material.tabs.TabLayout

/**
 * This fragment will hold all the viewPagerFragments
 */
class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewPagerUI()
    }

    fun viewPagerUI() {

        binding.tabs.addTab(binding.tabs.newTab().setText("WOMEN'S FASHION"))
        binding.tabs.addTab(binding.tabs.newTab().setText("MEN'S FASHION"))

        val adapter = TabPagerAdapter(activity!!.supportFragmentManager)
        adapter.addFragment(LadiesFragment(), "Ladies")
        adapter.addFragment(MensFragment(), "Gentlemen")

        binding.pager.offscreenPageLimit = 3

        binding.pager.adapter = adapter

        binding.pager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(binding.tabs))

        binding.tabs.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {
                // intentionally left blank
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                // intentionally left blank
            }

            override fun onTabSelected(tab: TabLayout.Tab?) {

                binding.pager.currentItem = tab!!.position
                if (tab.position == 0)
                    Toast.makeText(context, "Women's", Toast.LENGTH_LONG).show()
                else if (tab.position == 1)
                    Toast.makeText(context, "Mens's", Toast.LENGTH_LONG).show()
            }

        })

    }

}
