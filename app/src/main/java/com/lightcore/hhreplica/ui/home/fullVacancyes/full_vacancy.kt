package com.lightcore.hhreplica.ui.home.fullVacancyes

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lightcore.hhreplica.R
import com.lightcore.hhreplica.adapters.FullVacancyAdapter
import com.lightcore.hhreplica.ui.home.HomeViewModel

class FullVacancy : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("FullVacancy", "onCreateView")

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_full_vacancy, container, false)

        // Initialize ViewModel
        val homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        val backButton = view.findViewById<ImageButton>(R.id.imageButton)
        backButton.setOnClickListener {
            findNavController().navigateUp()
        }
        val text = view.findViewById<TextView>(R.id.textView2)
        // Initialize RecyclerView
        val vacancyView = view.findViewById<RecyclerView>(R.id.fullVacancyList)
        vacancyView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        context?.let { homeViewModel.getVacancy(requireContext()) }
        // Observe ViewModel data and set adapter
        homeViewModel.vacancy.observe(viewLifecycleOwner) { vacancy ->
            Log.d("FullVacancy", "Data received: ${vacancy?.size} items")
            val vacancyAdapter = context?.let { vacancy?.let { it1 -> FullVacancyAdapter(it, it1) } }
            vacancyView.adapter = vacancyAdapter
            text.text = (vacancy?.size.toString() + " вакансий")
        }

        return view
    }
}
