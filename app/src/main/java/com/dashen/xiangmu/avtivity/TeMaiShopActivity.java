package com.dashen.xiangmu.avtivity;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.dashen.xiangmu.R;
import com.dashen.xiangmu.customview.CustomToolBar;
import com.dashen.xiangmu.fragment.RvFragment;

public class TeMaiShopActivity extends AppCompatActivity {

    private CustomToolBar toolBarTeMaiShop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_te_mai_shop);
        toolBarTeMaiShop = ((CustomToolBar) findViewById(R.id.toolBar_TeMai_Shop));

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String shopUrl = bundle.getString("shopUrl");//吧这个url传给下面的fragment
        String title = bundle.getString("title");

        //吧url传给碎片
        RvFragment rvFragment = new RvFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Bundle b =new Bundle();
        b.putString("SHOP_URL",shopUrl);
        rvFragment.setArguments(b);
        ft.add(R.id.fLayoutShop,rvFragment);
        ft.show(rvFragment);
        ft.commit();

        toolBarTeMaiShop.setMyTitleText(title);
        toolBarTeMaiShop.setImgClickListener(new CustomToolBar.ImgCLickListener() {
            @Override
            public void onLeftImgClick(View view) {
                onBackPressed();
            }

            @Override
            public void onRightImgClick(View view) {

            }
        });
    }
}
