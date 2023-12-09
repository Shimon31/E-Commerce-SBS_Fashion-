package com.sbs.sbsfshion.fragments

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.sbs.sbsfshion.R
import com.sbs.sbsfshion.base.BaseFragment
import com.sbs.sbsfshion.databinding.FragmentIntroductionBinding


class IntroductionFragment : BaseFragment<FragmentIntroductionBinding>(FragmentIntroductionBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonStart.setOnClickListener {

            findNavController().navigate(R.id.action_introductionFragment_to_accountOptionFragment)

        }


    }

}