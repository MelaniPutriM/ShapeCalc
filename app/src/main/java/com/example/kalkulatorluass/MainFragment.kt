package com.example.kalkulatorluass

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.kalkulatorluass.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentMainBinding.inflate(inflater, container, false)

        binding.btnTriangle.setOnClickListener { navigateToFragment(R.id.action_mainFragment_to_triangleFragment) }
        binding.btnCircle.setOnClickListener { navigateToFragment(R.id.action_mainFragment_to_circleFragment) }
        binding.btnSquare.setOnClickListener { navigateToFragment(R.id.action_mainFragment_to_squareFragment) }
        binding.btnRectangle.setOnClickListener { navigateToFragment(R.id.action_mainFragment_to_rectangleFragment) }
        return binding.root
    }

    private fun navigateToFragment(action: Int) {
        val navController = findNavController()
        navController.navigate(action)
    }
}