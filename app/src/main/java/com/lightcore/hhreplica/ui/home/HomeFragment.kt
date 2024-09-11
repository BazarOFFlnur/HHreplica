package com.lightcore.hhreplica.ui.home

import OffersRecAdapter
import VacancyAdapter
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lightcore.hhreplica.DB.VacancyDAO
import com.lightcore.hhreplica.R
import com.lightcore.hhreplica.adapters.OnItemClickListener
import com.lightcore.hhreplica.dataModels.Offers
import com.lightcore.hhreplica.databinding.FragmentHomeBinding


class HomeFragment : Fragment(), OnItemClickListener {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val moreBtn = root.findViewById<Button>(R.id.more)
        val recyclerView = root.findViewById<RecyclerView>(R.id.offers_likst)
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        context?.let { homeViewModel.getOffers(it) }
        context?.let { homeViewModel.getVacancy(it) }
        val vacancyView = root.findViewById<RecyclerView>(R.id.vacansies_list)
        vacancyView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        homeViewModel.vacancy.observe(viewLifecycleOwner){vacancy ->
            val vacancyAdapter = vacancy?.let { VacancyAdapter(requireContext(), it) }
            vacancyView.adapter = vacancyAdapter
            vacancyAdapter?.notifyDataSetChanged()
            moreBtn.text = "Еще ${vacancy?.size} вакансий"
        }
        moreBtn.setOnClickListener {
            Log.d("HomeFragment", "More button clicked")
            findNavController().navigate(R.id.action_navigation_home_to_fullVacancyList)
        }
        homeViewModel.offers.observe(viewLifecycleOwner) { offers ->
            val offersAdapter = context?.let { OffersRecAdapter(offers, it, this) }
            recyclerView.adapter = offersAdapter
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onItemClick(offer: Offers) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(offer.link))
        startActivity(browserIntent)
    }
}