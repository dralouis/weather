package com.example.weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val aa = findViewById<WebView>(R.id.webview)
        aa .webViewClient = WebViewClient()
        aa.loadUrl("www.bbc.com/weather")
        val webSettings=aa.settings
        webSettings.javaScriptEnabled = true
    }


}


