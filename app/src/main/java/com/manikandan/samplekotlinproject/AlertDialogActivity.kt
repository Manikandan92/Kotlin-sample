package com.manikandan.samplekotlinproject

import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_alert_dialog.*
import org.jetbrains.anko.*

/**
 * Created by manikandan on 21/03/18.
 */
class AlertDialogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)

        toolBar.setTitle("Alert Dialog")
        simpleAlert.setOnClickListener {
            showSimpleAlert()
        }

        alertTwoButton.setOnClickListener {
            showAlertWithTwoButton()
        }

        alertThreeButton.setOnClickListener {
            showAlertWithThreeButton()
        }

        // ***** Anko Library button click action here ****** //
        ankoSimpleAlert.setOnClickListener {
            ankoShowSimpleAlert()
        }

        ankoAlertTwoButton.setOnClickListener {
            ankoShowAlertWithTwoButton()
        }

        ankoAlertThreeButton.setOnClickListener {
            ankoShowAlertWithThreeButton()
        }

        // Custom alert dialogs using Anko lib
        ankoCustomAlertButton.setOnClickListener {
            ankoCustomAlertDialog()
        }
    }

    private fun ankoCustomAlertDialog() {
        alert("Custom alert dialog messages", "Alert dialog") {
            positiveButton("POSITIVE") {

            }
            customView {
                verticalLayout {
                    textView("Sample textview")
                    button("Sample button")
                    editText("").setHint("Sample edit text")
                    padding = dip(16)
                }
            }

        }.show()
    }

    // ***** Anko Library Example code here ****** //
    private fun ankoShowAlertWithThreeButton() {
        alert("Simple Alert dialog positive, negative and neutral buttons", "Alert dialog") {
            positiveButton("POSITIVE") {
                // your code here
            }
            negativeButton("NEGATIVE") {
                // your code here
            }
            neutralPressed("NEUTRAL") {
                // your code here
            }
        }.show()
    }

    private fun ankoShowAlertWithTwoButton() {
        alert("Simple Alert dialog positive and negative buttons", "Alert dialog") {
            positiveButton("YES") {
                // your code here
            }
            negativeButton("NO") {
                // your code here
            }
        }.show()
    }

    private fun ankoShowSimpleAlert() {
        alert("Simple Alert dialog", "Alert dialog") {
            positiveButton("OK") {
                // your code here
            }
        }.show()
    }

    //General code here
    private fun showAlertWithThreeButton() {
        val alertDialog = AlertDialog.Builder(this).create()
        alertDialog.setTitle("Alert dialog")
        alertDialog.setMessage("Simple Alert dialog positive, negative and neutral buttons")

        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "POSITIVE", { dialogInterface, i ->
            // your code here
        })

        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "NEGATIVE", { dialogInterface, j ->
            // your code here
        })
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "NEUTRAL", { dialogInterface, k ->
            // your code here
        })

        alertDialog.show()
    }

    private fun showAlertWithTwoButton() {
        val alertDialog = AlertDialog.Builder(this).create()
        alertDialog.setTitle("Alert dialog")
        alertDialog.setMessage("Simple Alert dialog positive and negative buttons")

        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "YES", { dialogInterface, i ->
            // your code here
        })

        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "NO", { dialogInterface, i ->
            // your code here
        })

        alertDialog.show()
    }

    private fun showSimpleAlert() {

        val alertDialog = AlertDialog.Builder(this).create()
        alertDialog.setTitle("Alert dialog")
        alertDialog.setMessage("Simple Alert dialog")

        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK", { dialogInterface, i ->
            // your code here
        })

        alertDialog.show()
    }
}