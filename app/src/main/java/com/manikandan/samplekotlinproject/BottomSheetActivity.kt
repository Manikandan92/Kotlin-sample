package com.manikandan.samplekotlinproject

import android.os.Bundle
import android.support.design.widget.BottomSheetBehavior
import android.support.design.widget.CoordinatorLayout
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.FrameLayout

/**
 * Created by manikandan on 20/03/18.
 */
class BottomSheetActivity : AppCompatActivity() {

    lateinit var coordinatorLayout: CoordinatorLayout
    lateinit var bottomSheet: FrameLayout
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bottom_sheet_activity)


        coordinatorLayout = findViewById<CoordinatorLayout>(R.id.main_content) as CoordinatorLayout
        button = findViewById<Button>(R.id.button) as Button
        // The View with the BottomSheetBehavior
        bottomSheet = coordinatorLayout.findViewById(R.id.bottom_sheet)
        val behavior = BottomSheetBehavior.from(bottomSheet)
        behavior.setBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
            override fun onStateChanged(bottomSheet: View, newState: Int) {
                // React to state change
                Log.e("onStateChanged", "onStateChanged:" + newState)
                when (newState) {
                    BottomSheetBehavior.STATE_HIDDEN -> {
                    }
                    BottomSheetBehavior.STATE_EXPANDED -> {
                        button.setText("Close Sheet")
                    }
                    BottomSheetBehavior.STATE_COLLAPSED -> {
                        button.setText("Expand Sheet")
                    }
                    BottomSheetBehavior.STATE_DRAGGING -> {
                    }
                    BottomSheetBehavior.STATE_SETTLING -> {
                    }
                }
            }

            override fun onSlide(bottomSheet: View, slideOffset: Float) {
                // React to dragging events
                Log.e("onSlide", "onSlide")
            }
        })

        button.setOnClickListener {
            if (behavior.getState() != BottomSheetBehavior.STATE_EXPANDED) {
                behavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                button.setText("Close sheet");
            } else {
                behavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                button.setText("Expand sheet");
            }
        }
        behavior.peekHeight = 0
    }
}