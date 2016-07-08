package com.dashen.xiangmu.avtivity;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.dashen.xiangmu.R;
import com.dashen.xiangmu.adapter.WelcomeAdapter;
import com.viewpagerindicator.CirclePageIndicator;

import java.util.ArrayList;
import java.util.List;

public class WelcomeActivity extends AppCompatActivity {

    private ViewPager viewPagerWelcome;
    private CirclePageIndicator circulIndicatorWelcome;
    private List<ImageView> mList = new ArrayList<>();
    private WelcomeAdapter adapter;
    private Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        viewPagerWelcome = ((ViewPager) findViewById(R.id.viewPagerWelcome));
        circulIndicatorWelcome = ((CirclePageIndicator) findViewById(R.id.ciecle_indicator));
        btnStart = ((Button) findViewById(R.id.buttonStart));

        ImageView imageView1 = ((ImageView) getLayoutInflater().inflate(R.layout.imagewelcome,null));
        imageView1.setImageResource(R.mipmap.guide1);//设置引导页图片
        ImageView imageView2 = ((ImageView) getLayoutInflater().inflate(R.layout.imagewelcome, null));
        imageView2.setImageResource(R.mipmap.guide2);
        mList.add(imageView1);
        mList.add(imageView2);

        adapter = new WelcomeAdapter(mList);
        viewPagerWelcome.setAdapter(adapter);

        circulIndicatorWelcome.setViewPager(viewPagerWelcome);
        circulIndicatorWelcome.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                //切换到最后一页,点击按钮就可以跳转界面(可以动态添加,或者布局文件原来就存在动态显示)
                if (position==mList.size()-1){
                    btnStart.setVisibility(View.VISIBLE);
                }else {
                    btnStart.setVisibility(View.INVISIBLE);
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });




    }

    public void btnClick(View view) {
        startActivity(new Intent(this,MainActivity.class));
    }
}
