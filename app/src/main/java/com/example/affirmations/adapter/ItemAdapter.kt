package com.example.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class ItemAdapter(val context: Context,private val affirmationList:List<Affirmation>):RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(val view: View): RecyclerView.ViewHolder(view)
    {
        val titleText:TextView = view.findViewById(R.id.item_title)
        val image:ImageView=view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = affirmationList.get(position)
        holder.titleText.text= context.getString(item.StringResourceId)
        holder.image.setImageResource(item.imageResourceId)
    }

    override fun getItemCount(): Int {
        return affirmationList.size
    }
}