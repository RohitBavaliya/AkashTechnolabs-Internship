package com.example.webviewdemo;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SearchWebsite extends AppCompatActivity {
    WebView myWebView;
    String url;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_search_website);

        myWebView = findViewById(R.id.myWebView);
        myWebView.getSettings().setJavaScriptEnabled(true);
        Intent intent = getIntent();
        url = intent.getStringExtra("url");
        myWebView.loadUrl(url);
    }

}