package com.example.kalkulatorluass

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.kalkulatorluass.R
import com.example.kalkulatorluass.databinding.FragmentSquareBinding

class SquareFragment : Fragment() {

    private lateinit var binding: FragmentSquareBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_square, container, false)
        binding.btnCalculate.setOnClickListener { calculateArea() }
        return binding.root
    }

    private fun calculateArea() {
        val side = binding.etSide.text.toString().toDouble()
        val area = side * side
        binding.tvResult.text = getString(R.string.area_result, area)
        binding.tvResult.visibility = View.VISIBLE
    }
}
