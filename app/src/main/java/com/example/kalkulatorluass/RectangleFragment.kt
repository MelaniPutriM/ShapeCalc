package com.example.kalkulatorluass

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.kalkulatorluass.R
import com.example.kalkulatorluass.databinding.FragmentRectangleBinding

class RectangleFragment : Fragment() {

    private lateinit var binding: FragmentRectangleBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_rectangle, container, false)
        binding.btnCalculate.setOnClickListener { calculateArea() }
        return binding.root
    }

    private fun calculateArea() {
        val length = binding.etLength.text.toString().toDouble()
        val width = binding.etWidth.text.toString().toDouble()
        val area = length * width
        binding.tvResult.text = getString(R.string.area_result, area)
        binding.tvResult.visibility = View.VISIBLE
    }
}
