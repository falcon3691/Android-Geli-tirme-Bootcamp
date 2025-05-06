package com.example.odev4.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.FragmentNavigatorExtras
import com.example.odev4.R
import com.example.odev4.databinding.FragmentAnaSayfaBinding

class AnaSayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnaSayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentAnaSayfaBinding.inflate(inflater, container, false)
        binding.buttonGitA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfaAGecis)
        }
        binding.buttonGitX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfaXGecis)
        }
        return binding.root
    }

}