package com.dashen.xiangmu.adapter;

import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;

import com.dashen.xiangmu.avtivity.TeMaiGoodsActivity;

import java.util.List;

/**
 * Created by Administrator on 2016/7/4.
 */
public class LunBoAdapter extends PagerAdapter {
    private List<ImageView> viewlist;

    public LunBoAdapter(List<ImageView> viewlist) {
        this.viewlist = viewlist;
    }

    @Override
    public int getCount() {
        //设置成最大，使用户看不到边界
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean isViewFromObject(View arg0, Object arg1) {
        return arg0==arg1;
    }
    @Override
    public void destroyItem(ViewGroup container, int position,
                            Object object) {
        //Warning：不要在这里调用removeView
    }
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        //对ViewPager页号求模取出View列表中要显示的项
        position %= viewlist.size();
        if (position<0){
            position = viewlist.size()+position;
        }
        final int index = position;
        ImageView view = viewlist.get(position);
        //如果View已经在之前添加到了一个父组件，则必须先remove，否则会抛出IllegalStateException。
        ViewParent vp =view.getParent();
        if (vp!=null){
            ViewGroup parent = (ViewGroup)vp;
            parent.removeView(view);
        }
        container.addView(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (indexCallBack!=null){
                    indexCallBack.indexClicked(index);
                }
            }
        });
        //add listeners here if necessary
        return view;
    }
    public IndexCallBack indexCallBack;
    public void setIndexCallBack(IndexCallBack indexCallBack){
        this.indexCallBack = indexCallBack;
    }
    public interface IndexCallBack{
        public void indexClicked(int index);
    }
}
