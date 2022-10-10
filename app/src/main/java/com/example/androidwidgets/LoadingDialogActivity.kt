package com.example.androidwidgets

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.ProgressDialog
import android.os.Handler
import android.support.v4.app.RemoteActionCompatParcelizer
import android.view.View
import androidx.appcompat.app.AlertDialog
import android.widget.ProgressBar

class LoadingDialogActivity(val mActivity:Activity){
    private lateinit var isdialog: AlertDialog
    fun startLoading(){

        val infalter = mActivity.layoutInflater
        val dialogView = infalter.inflate(R.layout.activity_loading_dialog,null)
        val bulider = AlertDialog.Builder(mActivity)
        bulider.setView(dialogView)
        bulider.setCancelable(false)
        isdialog = bulider.create()
        isdialog.show()

    }

    fun isDismiss(){
        isdialog.dismiss()

    }
}