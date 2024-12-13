package com.example.questiq.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.questiq.R
import com.example.questiq.data.Datasource
import com.example.questiq.databinding.FragmentHomeScreenBinding
import com.example.questiq.view.QuizAdapter

class HomeScreen : Fragment() {

    private lateinit var binding: FragmentHomeScreenBinding
    private val quizAdapter by lazy {QuizAdapter()}

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeScreenBinding.inflate(inflater, container, false)




        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = quizAdapter
        }

        quizAdapter.setOnItemClickListener(object : QuizAdapter.OnItemClickListener{
            override fun onItemClick(position: Int) {
                findNavController().navigate(R.id.action_homeScreen_to_quizScreen)
            }
        })

        quizAdapter.differ.submitList(Datasource().loadDetails())
        return binding.root
    }
}
