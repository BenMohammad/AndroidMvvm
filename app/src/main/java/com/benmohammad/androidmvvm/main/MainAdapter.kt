package com.benmohammad.androidmvvm.main

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.benmohammad.androidmvvm.R

class MainAdapter(private val items: List<String>, private val listener: (String) -> Unit): RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.view_main_item, parent, false) as TextView
        return MainViewHolder(v)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val item = items[position]
        holder.textView.text = item
        holder.textView.setOnClickListener{
            listener(item)
        }
    }

    class MainViewHolder(val textView: TextView): RecyclerView.ViewHolder(textView) {

    }

}