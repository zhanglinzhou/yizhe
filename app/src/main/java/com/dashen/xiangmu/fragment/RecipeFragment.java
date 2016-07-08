package com.dashen.xiangmu.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.dashen.xiangmu.R;
import com.dashen.xiangmu.adapter.LunBoAdapter;
import com.dashen.xiangmu.adapter.MainCategoryAdapter;
import com.dashen.xiangmu.adapter.VideoActivity;
import com.dashen.xiangmu.avtivity.SearchActivity;
import com.dashen.xiangmu.avtivity.TeMaiGoodsActivity;
import com.dashen.xiangmu.bean.MainCatedoryBean;
import com.dashen.xiangmu.customview.MyGridView;
import com.dashen.xiangmu.utils.HttpUrls;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecipeFragment extends Fragment  {
    public static final int  MSG_TURN = 0x11;
    public static final int  MSG_TURN_STOP = 0x12;
    public static final int  MSG_BACK_RESET = 0x99;
    public static final long DURATION_TURN = 2000;


    private TextView textIndexMain;
    private LinearLayout lLayoutYao;
    private ViewPager viewPagerCircle;
    private List<ImageView> mList;
    private LunBoAdapter adapter;

    private MyGridView gvCategoryMain;
    private MainCategoryAdapter mainCategoryAdapter;
    private RequestQueue requestQueue;



    private Handler handler = new Handler(){
        @Override
        public void handleMessage(android.os.Message msg) {
            switch (msg.what) {
                case MSG_TURN: //开始轮询消息
                    int pager = viewPagerCircle.getCurrentItem();
                    pager++;
                    viewPagerCircle.setCurrentItem(pager);
                    handler.sendEmptyMessageDelayed(MSG_TURN, DURATION_TURN);
                    break;
                case MSG_TURN_STOP: //停止轮询消息
                    handler.removeMessages(MSG_TURN); //移除轮询的消息
                    break;

                default:
                    break;
            }
        }
    };
    public RecipeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestQueue = Volley.newRequestQueue(getActivity());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recipe, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textIndexMain = ((TextView) view.findViewById(R.id.text_index_main));
        lLayoutYao = ((LinearLayout) view.findViewById(R.id.lLayoutYao));
        viewPagerCircle = ((ViewPager) view.findViewById(R.id.viewPagerCircer));
        //********************处理中间分类的gridview********************************
        gvCategoryMain = ((MyGridView) view.findViewById(R.id.gv_category_main));

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(HttpUrls.MAIN_CATEGORY,
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        MainCatedoryBean mainCatedoryBean = new Gson().fromJson(response.toString(),MainCatedoryBean.class);
                        mainCategoryAdapter = new MainCategoryAdapter(getActivity(),mainCatedoryBean);
                        gvCategoryMain.setAdapter(mainCategoryAdapter);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getActivity(), "分类数据网络请求失败", Toast.LENGTH_SHORT).show();
                    }
                });
        requestQueue.add(jsonObjectRequest);
        //********************处理中间分类的gridview********************************
        //**************处理轮播**************************************************
        initViewPager(view,savedInstanceState);
        adapter = new LunBoAdapter(mList);

        viewPagerCircle.setAdapter(adapter);
        handler.sendEmptyMessageDelayed(MSG_TURN, DURATION_TURN);

        viewPagerCircle.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int arg0) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onPageScrollStateChanged(int state) { //滑动状态的判断
                // TODO Auto-generated method stub
                switch (state) {
                    case ViewPager.SCROLL_STATE_IDLE:
                        //停止滑动状态
                        if(!handler.hasMessages(MSG_TURN)){ //如果没有轮询
                            //重新开始轮询
                            handler.sendEmptyMessageDelayed(MSG_TURN, DURATION_TURN);
                        }
                        break;
                    case ViewPager.SCROLL_STATE_DRAGGING:
                        //手指在屏幕滑动的状态
                        //发送停止轮询的消息(立即发送)
                        handler.sendEmptyMessage(MSG_TURN_STOP);
                        break;
                    case ViewPager.SCROLL_STATE_SETTLING:

                        break;
                    default:
                        break;
                }

            }
        });
        viewPagerCircle.setCurrentItem(Integer.MAX_VALUE/2);
        //接口会掉监听到的点击轮播中的哪张图片
        adapter.setIndexCallBack(new LunBoAdapter.IndexCallBack() {
            @Override
            public void indexClicked(int index) {
                if (index == 0){
                    Intent intent = new Intent(getActivity(), TeMaiGoodsActivity.class);
                    intent.putExtra("goodsUrl","http://www.1zhe.com/html5/apph5/20151014082914.html");
                    intent.putExtra("goodsTitle","亲～给我们一个好评");
                    startActivity(intent);
                }else if (index == 1){
                    Toast.makeText(getActivity(), "处理播放视频", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getActivity(), VideoActivity.class);
                    startActivity(intent);
                }
            }
        });
        //**************处理轮播**************************************************

        textIndexMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), SearchActivity.class));
            }
        });
        lLayoutYao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "点击了摇奖签到", Toast.LENGTH_SHORT).show();
            }
        });
    }


    //动态设置轮播图
    public void initViewPager(View view,Bundle savedInstanceState){
        int[] resIds = new int[]{R.mipmap.ad_one,R.mipmap.ad_two};
        mList = new ArrayList<>();
        for (int i = 0; i < resIds.length; i++) {
            ImageView imageView = (ImageView) getLayoutInflater(savedInstanceState).inflate(R.layout.imagewelcome,null);
            imageView.setImageResource(resIds[i]);
            mList.add(imageView);

        }
    }



}

