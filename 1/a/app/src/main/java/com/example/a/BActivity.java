package com.example.a;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.jph.restart01.R;

public class BActivity extends AppCompatActivity {

    private WebView wv_web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        wv_web = (WebView) findViewById(R.id.wv_web);
        //接收main页面界面传递过来的数据（网址)
        String path=getIntent().getDataString();

        //让wv_web加载网址
        wv_web.loadUrl(path);

        //设置使用自己的wv_web客户端打开网址
        wv_web.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
    }
}

