package com.manikandan.samplekotlinproject

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnListView: Button
    lateinit var btnRecyclerView: Button
    lateinit var btnNavigationDrawer: Button
    lateinit var btnTabLayout: Button
    lateinit var btnBottomSheetLayout: Button
    lateinit var btnAlertDialogLayout: Button
    lateinit var toolBar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolBar = findViewById<Toolbar>(R.id.toolBar) as Toolbar
        btnListView = findViewById<Button>(R.id.btn_list_view) as Button
        btnRecyclerView = findViewById<Button>(R.id.btn_recycler_view) as Button
        btnNavigationDrawer = findViewById<Button>(R.id.btn_navigation) as Button
        btnTabLayout = findViewById<Button>(R.id.btn_tab_layout) as Button
        btnBottomSheetLayout = findViewById<Button>(R.id.btn_bottom_sheet_layout) as Button
        btnAlertDialogLayout = findViewById<Button>(R.id.btn_alert_dialog_layout) as Button

        toolBar.setTitle("Sample")

        btnListView.setOnClickListener {
            val intent = Intent(this, SimpleListViewActivity::class.java)
            startActivity(intent)
        }
        btnRecyclerView.setOnClickListener {
            val intent = Intent(this, RecyclerViewActivity::class.java)
            startActivity(intent)
        }

        btnNavigationDrawer.setOnClickListener {
            val intent = Intent(this, NavigationDrawerActivity::class.java)
            startActivity(intent)
        }

        btnTabLayout.setOnClickListener {
            val intent = Intent(this, TabLayoutActivity::class.java)
            startActivity(intent)
        }

        btnBottomSheetLayout.setOnClickListener {
            val intent = Intent(this, BottomSheetActivity::class.java)
            startActivity(intent)
        }
        btnAlertDialogLayout.setOnClickListener {
            val intent = Intent(this, AlertDialogActivity::class.java)
            startActivity(intent)
        }
    }
}

