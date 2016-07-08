package com.dashen.xiangmu.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.dashen.xiangmu.R;
import com.dashen.xiangmu.adapter.ListTeMaiAdapter;
import com.dashen.xiangmu.avtivity.TeMaiGoodsActivity;
import com.dashen.xiangmu.avtivity.TeMaiShopActivity;
import com.dashen.xiangmu.bean.ListTeMaiBean;
import com.dashen.xiangmu.customview.MyGridView;
import com.dashen.xiangmu.utils.HttpUrls;
import com.google.gson.Gson;

import org.json.JSONObject;

/**
 * A simple {@link Fragment} subclass.
 */
public class ZhenFragment extends Fragment {


    private MyGridView gvTeMai;
    private ArrayAdapter adapter;
    private String[] data = new String[]{
            "全部","女装","美食","母婴",
            "鞋包","美妆","家居","数码",
            "配饰","文体","男装","中老年"};
    private ListView listViewTeMai;
    private ListTeMaiAdapter teMaiAdapter;
    private RequestQueue requestQueue;
    private ListTeMaiBean.DataBean dataBean;

    public ZhenFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestQueue= Volley.newRequestQueue(getActivity());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_zhen, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        gvTeMai = ((MyGridView) view.findViewById(R.id.gv_temai));
        adapter = new ArrayAdapter(getActivity(),R.layout.item_gv_temai,data);
        gvTeMai.setAdapter(adapter);

        gvTeMai.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "点击了："+position, Toast.LENGTH_SHORT).show();
            }
        });

        //listview
        listViewTeMai = ((ListView) view.findViewById(R.id.listViewTeMai));
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                HttpUrls.URL_TEMAI_MAIN,
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        ListTeMaiBean listTeMaiBean = new Gson().fromJson(response.toString(),ListTeMaiBean.class);
                        dataBean = listTeMaiBean.getData();
                        teMaiAdapter = new ListTeMaiAdapter(getActivity(),dataBean);

                        teMaiAdapter.setLayoutClickListener(new ListTeMaiAdapter.LayoutClickListener() {
                            @Override
                            public void onShopClick(String shopUrl,String title) {
                                Intent intent = new Intent(getActivity(), TeMaiShopActivity.class);
                                intent.putExtra("shopUrl",shopUrl);
                                intent.putExtra("title",title);
                                startActivity(intent);
                            }

                            @Override
                            public void onGoods1Click(String goodsUrl1,String title) {
                                Intent intent = new Intent(getActivity(), TeMaiGoodsActivity.class);
                                intent.putExtra("goodsUrl",goodsUrl1);
                                intent.putExtra("goodsTitle",title);
                                startActivity(intent);
                            }

                            @Override
                            public void onGoods2Click(String goodsUrl2,String title) {
                                Intent intent = new Intent(getActivity(), TeMaiGoodsActivity.class);
                                intent.putExtra("goodsUrl",goodsUrl2);
                                intent.putExtra("goodsTitle",title);
                                startActivity(intent);
                            }

                            @Override
                            public void onGoods3Click(String goodsUrl3,String title) {
                                Intent intent = new Intent(getActivity(), TeMaiGoodsActivity.class);
                                intent.putExtra("goodsUrl",goodsUrl3);
                                intent.putExtra("goodsTitle",title);
                                startActivity(intent);
                            }
                        });

                        listViewTeMai.setAdapter(teMaiAdapter);
                        listViewTeMai.setLayoutParams(getListViewParams());//jia
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        );
        requestQueue.add(jsonObjectRequest);




    }

    public ViewGroup.LayoutParams getListViewParams(){
        //通过ListView获取其中的适配器adapter
        ListAdapter listAdapter = listViewTeMai.getAdapter();
        //声明默认高度为0
        int totalHeight = 0;
        //便利ListView所有的item，累加所有item的高度就是ListView的实际高度
        for (int i = 0; i < listAdapter.getCount(); i++) {
            View listitem = listAdapter.getView(i,null,listViewTeMai);
            listitem.measure(0,0);
            totalHeight+=listitem.getMeasuredHeight();

        }
        //将累加获取的totalHeight赋值给LayoutParams的height属性
        ViewGroup.LayoutParams params = listViewTeMai.getLayoutParams();
        params.height = totalHeight+(listViewTeMai.getDividerHeight()*(listAdapter.getCount()-1));
        return params;
    }
}
