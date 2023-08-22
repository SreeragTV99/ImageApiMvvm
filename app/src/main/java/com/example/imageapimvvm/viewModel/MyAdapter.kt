package com.example.imageapimvvm.viewModel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.imageapimvvm.R
import com.example.imageapimvvm.model.Images


class MyAdapter(private val imageList: List<Images>):

    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title = view.findViewById<TextView>(R.id.imageTitle)
        val description = view.findViewById<TextView>(R.id.imageDescription)
        val imageView = view.findViewById<ImageView>(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutView = LayoutInflater.from(parent.context).inflate(R.layout.listitem, parent, false)
        return MyViewHolder(layoutView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val imageItem = imageList[position]
        holder.title.text = imageItem.title
        holder.description.text = imageItem.description
        holder.imageView.let{
            it.loadImage(imageItem.url)
        }
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

}
