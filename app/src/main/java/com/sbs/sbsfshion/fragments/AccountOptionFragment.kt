package com.sbs.sbsfshion.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.sbs.sbsfshion.R
import com.sbs.sbsfshion.base.BaseFragment
import com.sbs.sbsfshion.databinding.FragmentAccountOptionBinding
import com.sbs.sbsfshion.databinding.FragmentIntroductionBinding


class AccountOptionFragment :
    BaseFragment<FragmentAccountOptionBinding>(FragmentAccountOptionBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonLogin.setOnClickListener {

            findNavController().navigate(R.id.action_accountOptionFragment_to_loginFragment)

        }

        binding.buttonRegister.setOnClickListener {

            findNavController().navigate(R.id.action_accountOptionFragment_to_registerFragment)

        }
    }

}
