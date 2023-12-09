# H5项目打包APK
[视频教程](https://www.bilibili.com/video/BV1x84y1n7b5/?share_source=copy_web&vd_source=749b589b89b4936210c37fc955a87de5)  
[下载Android Studio](https://developer.android.google.cn/studio/)  
[项目demo]()

<details>

<summary>MainActivity.java</summary>

```java
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
        // 开启javascript
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new WebViewClient());
        // 载入内容
        mWebView.loadUrl("file:///android_asset/index.html");
    }
}
```

</details>

<details>

<summary>activity_main.xml</summary>

```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">
    <WebView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:id="@+id/mWebView">
    </WebView>
</androidx.constraintlayout.widget.ConstraintLayout>
```

</details>


`<link>`、`<video>`、`<img>`等的`src`属性前要加上`file:///android_asset/`