package com.manikandan.samplekotlinproject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import com.manikandan.samplekotlinproject.adapter.CustomRecyclerAdapter
import kotlinx.android.synthetic.main.recyler_view_main.*

class RecyclerViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recyler_view_main)

        toolBar.setTitle("Recycler view")
        rvRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        var adapter = CustomRecyclerAdapter(Helper.Companion.getListViewModelList())
        rvRecyclerView.adapter = adapter
    }
}