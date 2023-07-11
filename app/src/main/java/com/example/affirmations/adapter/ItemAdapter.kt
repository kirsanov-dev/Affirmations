package com.example.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.databinding.ListItemBinding
import com.example.affirmations.model.Affirmation

class ItemAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
    ): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(val view: View, private val context: Context): RecyclerView.ViewHolder(view) {
        val binding = ListItemBinding.bind(view)

        fun bind(affirmation: Affirmation) = with(binding) {
            itemTitle.text = context.resources.getString(affirmation.stringResourceId)
            itemImage.setImageResource(affirmation.imageResourceId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(view, context)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.bind(item)
        holder.view.setOnClickListener {
            Toast.makeText(context, item.stringResourceId, Toast.LENGTH_SHORT).show()
        }
    }
}