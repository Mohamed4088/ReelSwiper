
package com.reelsswip

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // hide action bar handled by theme
        setContentView(R.layout.activity_main)
        webView = findViewById(R.id.webview)
        webView.settings.javaScriptEnabled = true
        webView.webViewClient = WebViewClient()
        // load local offline file
        webView.loadUrl("file:///android_asset/index.html")
    }
    override fun onBackPressed() {
        if (webView.canGoBack()) webView.goBack() else super.onBackPressed()
    }
}
