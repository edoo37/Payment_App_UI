package com.yasinsenel.paymentapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.shape.CornerFamily
import com.yasinsenel.paymentapp.R
import com.yasinsenel.paymentapp.databinding.FragmentAddMoneyBinding


class AddMoneyFragment : Fragment() {
    private lateinit var binding : FragmentAddMoneyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddMoneyBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.card.shapeAppearanceModel = binding.card.shapeAppearanceModel.toBuilder()
            .setBottomLeftCorner(CornerFamily.ROUNDED, 80f)
            .setBottomRightCorner(CornerFamily.ROUNDED, 80f)
            .build()

        binding.card2.shapeAppearanceModel = binding.card2.shapeAppearanceModel.toBuilder()
            .setTopLeftCorner(CornerFamily.ROUNDED, 80f)
            .setTopRightCorner(CornerFamily.ROUNDED, 80f)
            .build()
    }
}
