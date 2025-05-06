package com.example.odev4.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4.R
import com.example.odev4.databinding.FragmentSayfaBBinding

class SayfaBFragment : Fragment() {
    private lateinit var binding: FragmentSayfaBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentSayfaBBinding.inflate(inflater, container, false)
        binding.buttonGitY2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfaYGecis2)
        }
        return binding.root
    }

}