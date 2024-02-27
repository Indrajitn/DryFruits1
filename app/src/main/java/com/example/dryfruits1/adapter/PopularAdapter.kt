package com.example.dryfruits1.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dryfruits1.databinding.PopularItemBinding

class PopularAdapter(private val items:List<String>,private val price:List<String>,private val image:List<Int>) : RecyclerView.Adapter<PopularAdapter.PopularViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
        return PopularViewHolder(PopularItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }



    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        val item = items[position]
        val price=price[position]
        val images=image[position]
        holder.bind(item,price,images )
    }
    override fun getItemCount(): Int {
        return items.size
    }
    class PopularViewHolder (private val binding:PopularItemBinding):RecyclerView.ViewHolder(binding.root) {
        private val imagesView = binding.menuImage
        fun bind(item: String, price: String,images: Int) {
            binding.menufoodName.text=item
            binding.menuPrice.text=price
            imagesView.setImageResource(images)
        }

    }
}