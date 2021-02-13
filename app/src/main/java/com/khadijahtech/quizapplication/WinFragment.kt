package com.khadijahtech.quizapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.khadijahtech.quizapplication.databinding.FragmentGameOverBinding
import com.khadijahtech.quizapplication.databinding.FragmentWinBinding


class WinFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding =
            DataBindingUtil.inflate<FragmentWinBinding>(
                inflater,
                R.layout.fragment_win, container, false
            )

        return binding.root
    }

}