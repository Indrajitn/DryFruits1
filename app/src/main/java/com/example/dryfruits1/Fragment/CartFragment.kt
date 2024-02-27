package com.example.dryfruits1.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dryfruits1.PayOutActivity
import com.example.dryfruits1.R
import com.example.dryfruits1.adapter.CartAdapter
import com.example.dryfruits1.databinding.FragmentCartBinding


class CartFragment : Fragment() {
    private lateinit var binding: FragmentCartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCartBinding.inflate (inflater, container,  false)
        val cartFoodName = listOf( "Cashews","Almonds","Pistachios","Peanuts","Raisins","Dates")
        val cartItemPtice = listOf("Rs.965","Rs.959","Rs.532","Rs.554","Rs.242","Rs.425")
        val cartImage = listOf(
            R.drawable.menu1,
            R.drawable.menu2,
            R.drawable.menu3,
            R.drawable.menu4,
            R.drawable.menu5,
            R.drawable.menu6)
        val adapter =CartAdapter(ArrayList(cartFoodName),ArrayList(cartItemPtice),ArrayList(cartImage))
        binding.cartRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.cartRecyclerView.adapter = adapter
        binding.proceedButton.setOnClickListener{
            val intent = Intent(requireContext(),PayOutActivity::class.java)
            startActivity(intent)
        }
        return binding.root
    }

    companion object {

    }
}