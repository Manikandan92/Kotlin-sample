package com.manikandan.samplekotlinproject

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.BaseAdapter
import android.widget.TextView
import com.manikandan.sample_kotlin.datamodel.ListViewModel
import kotlinx.android.synthetic.main.list_view_main.*

class SimpleListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_view_main)
        toolBar.setTitle("Listview")
        var listViewAdapter = ListViewModelAdapter(this, Helper.Companion.getListViewModelList())
        lvSample.adapter = listViewAdapter
        lvSample.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, position, id ->
        }
    }


    inner class ListViewModelAdapter : BaseAdapter {

        private var listModelArrayList = ArrayList<ListViewModel>()
        private var context: Context? = null

        constructor(context: Context, notesList: ArrayList<ListViewModel>) : super() {
            this.listModelArrayList = notesList
            this.context = context
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
            val view: View?
            val vh: ViewHolder

            if (convertView == null) {
                view = layoutInflater.inflate(R.layout.list_view_item, parent, false)
                vh = ViewHolder(view)
                view.tag = vh
            } else {
                view = convertView
                vh = view.tag as ViewHolder
            }
            vh.tvTitle.text = listModelArrayList[position].title
            vh.tvContent.text = listModelArrayList[position].content
            return view
        }

        override fun getItem(position: Int): Any {
            return listModelArrayList[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {
            return listModelArrayList.size
        }
    }

    private class ViewHolder(view: View?) {
        val tvTitle: TextView = view?.findViewById<TextView>(R.id.tvTitle) as TextView
        val tvContent: TextView = view?.findViewById<TextView>(R.id.tvContent) as TextView
    }
}