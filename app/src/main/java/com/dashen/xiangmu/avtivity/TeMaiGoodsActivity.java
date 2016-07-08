package com.dashen.xiangmu.avtivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.dashen.xiangmu.R;
import com.dashen.xiangmu.customview.CustomToolBar;

public class TeMaiGoodsActivity extends AppCompatActivity {

    private CustomToolBar toolBarTeMaiGoods;
    private WebView webViewTeMaiGoos;

    @Override
    @SuppressLint("JavascriptInterface")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_te_mai_goods);
        toolBarTeMaiGoods = ((CustomToolBar) findViewById(R.id.toolBar_TeMai_Goods));
        webViewTeMaiGoos = ((WebView) findViewById(R.id.web_view_TeMai_Goods));
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String urlGoods = bundle.getString("goodsUrl");
        String titleGoods = bundle.getString("goodsTitle");
        toolBarTeMaiGoods.setMyTitleText(titleGoods);

        //加载具体的网址
        //设置WebView自己打开相应的网址
        webViewTeMaiGoos.setWebViewClient(new WebViewClient());
        webViewTeMaiGoos.loadUrl(urlGoods);

        toolBarTeMaiGoods.setImgClickListener(new CustomToolBar.ImgCLickListener() {
            @Override
            public void onLeftImgClick(View view) {
                onBackPressed();
            }

            @Override
            public void onRightImgClick(View view) {
                onBackPressed();
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (webViewTeMaiGoos.canGoBack()){
            webViewTeMaiGoos.goBack();
        }else {
            super.onBackPressed();
        }

    }

}
