package com.yasinsenel.paymentapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.shape.CornerFamily
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.yasinsenel.paymentapp.R
import com.yasinsenel.paymentapp.adapter.Adapter
import com.yasinsenel.paymentapp.databinding.FragmentAddMoneyBinding
import com.yasinsenel.paymentapp.databinding.FragmentSendMoneyBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class SendMoneyFragment : Fragment() {

    private lateinit var binding : FragmentSendMoneyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSendMoneyBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            binding.card.shapeAppearanceModel = binding.card.shapeAppearanceModel.toBuilder()
                .setBottomLeftCorner(CornerFamily.ROUNDED, 80f)
                .setBottomRightCorner(CornerFamily.ROUNDED, 80f)
                .build()
            val animalsArray = arrayOf("MOBILE PHONE", "PAYAPP NUMBER")

            val adapter = Adapter(requireActivity(), animalsArray.size)
            viewPager.adapter = adapter

            tabLayout.tabGravity = TabLayout.GRAVITY_FILL

            TabLayoutMediator(tabLayout, viewPager) { tab, position ->
                tab.text = animalsArray[position]
            }.attach()
        }
    }
}