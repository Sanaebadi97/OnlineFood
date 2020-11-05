package com.awizhe.food.mvvm.feature.view.fragment.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.awizhe.food.R
import com.awizhe.food.databinding.FragmentMessageBinding
import dagger.android.support.DaggerFragment

class MessageFragment : DaggerFragment() {
    private lateinit var binding: FragmentMessageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMessageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.layoutCreateTicket.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_message_fragment_to_submitTicketFragment)
        }
    }
}