package com.example.arya.jakarta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class berita extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berita);

        WebView web = (WebView) findViewById(R.id.web);
        web.loadUrl("http://www.liputan6.com/tag/jakarta-hari-ini");
        web.setWebViewClient(new WebViewClient());
    }
}
