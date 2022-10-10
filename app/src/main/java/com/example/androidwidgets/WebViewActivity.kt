package com.example.androidwidgets

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class WebViewActivity : AppCompatActivity() {

    private lateinit var webview: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        webview = findViewById(R.id.wv)
        webview.webViewClient = WebViewClient()
        webview.loadUrl("https://www.seasiainfotech.com")
        val webSettings = webview.settings
        webSettings.javaScriptEnabled = true
        webSettings.domStorageEnabled = true
    }

    override fun onBackPressed() {
        if (webview.canGoBack()){
            webview.goBack()
        }else{
            super.onBackPressed()
        }
    }

    }
