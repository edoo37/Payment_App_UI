package com.yasinsenel.paymentapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.yasinsenel.paymentapp.fragment.SendFromNumberFragment
import com.yasinsenel.paymentapp.fragment.SendFromPhoneFragment

class Adapter (fm: FragmentActivity, var totalTabs: Int): FragmentStateAdapter(fm) {

    override fun getItemCount(): Int {
        return totalTabs
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> SendFromPhoneFragment()
            1 -> SendFromNumberFragment()
            else -> SendFromPhoneFragment()
        }
    }

}
