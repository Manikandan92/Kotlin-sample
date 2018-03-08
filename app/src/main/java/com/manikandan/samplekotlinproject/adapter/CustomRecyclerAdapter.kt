package com.manikandan.samplekotlinproject.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.manikandan.sample_kotlin.datamodel.ListViewModel
import com.manikandan.samplekotlinproject.R

class CustomRecyclerAdapter(val userList: ArrayList<ListViewModel>) : RecyclerView.Adapter<CustomRecyclerAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.txtTitle?.text = userList[position].title
        holder?.txtContent?.text = userList[position].content

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.list_view_item, parent, false)
        return ViewHolder(v);
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtTitle = itemView.findViewById<TextView>(R.id.tvTitle)
        val txtContent = itemView.findViewById<TextView>(R.id.tvContent)
    }
}