package com.example.myapplication;

import android.os.Bundle;
import android.app.Activity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 实例化
        mWebView = (WebView) findViewById(R.id.mWebView);

        // 开启javascript 渲染
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new WebViewClient());

        // 载入内容
        mWebView.loadUrl("file:///android_asset/index.html");

    }

}
