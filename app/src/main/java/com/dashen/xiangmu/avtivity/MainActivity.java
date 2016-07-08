package com.dashen.xiangmu.avtivity;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.dashen.xiangmu.R;
import com.dashen.xiangmu.fragment.PaiFragment;
import com.dashen.xiangmu.fragment.RecipeFragment;
import com.dashen.xiangmu.fragment.UserFragment;
import com.dashen.xiangmu.fragment.ZhenFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Fragment> fragmentList;
    private TabLayout tabMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabMain = ((TabLayout) findViewById(R.id.tab_main));

        initFragment();
        initTabMain();
    }

    public void initTabMain(){
        TabLayout.Tab tabRecipe = tabMain.newTab().setIcon(R.drawable.bottom_recipe_selector).setText("首页");
        TabLayout.Tab tabPai = tabMain.newTab().setIcon(R.drawable.bottom_pai_selector).setText("话题");
        TabLayout.Tab tabZhen = tabMain.newTab().setIcon(R.drawable.bottom_zhen_selector).setText("品牌特卖");
        TabLayout.Tab tabUser = tabMain.newTab().setIcon(R.drawable.bottom_user_selector).setText("我");
        tabMain.addTab(tabRecipe);
        tabMain.addTab(tabPai);
        tabMain.addTab(tabZhen);
        tabMain.addTab(tabUser);

        tabMain.setTabTextColors(Color.parseColor("#7D7D7D"),Color.parseColor("#FF3C3C"));
        tabMain.setSelectedTabIndicatorHeight(0);
        tabMain.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                showFragmentByIndex(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
    public void initFragment(){
        fragmentList = new ArrayList<>();
        fragmentList.add(new RecipeFragment());
        fragmentList.add(new PaiFragment());
        fragmentList.add(new ZhenFragment());
        fragmentList.add(new UserFragment());

        showFragmentByIndex(0);
    }

    public void showFragmentByIndex(int position){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        for (int i = 0; i <fragmentList.size() ; i++) {
            Fragment f = fragmentList.get(i);
            if (!f.isAdded()){
                ft.add(R.id.fLayout,f);
            }
            if (i==position){
                ft.show(f);
            }else {
                ft.hide(f);
            }
        }
        ft.commit();
    }

}
