package com.dashen.xiangmu.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.dashen.xiangmu.R;
import com.dashen.xiangmu.adapter.RvFragmentAdapter;
import com.dashen.xiangmu.avtivity.TeMaiGoodsActivity;
import com.dashen.xiangmu.bean.RvGoodsBean;
import com.dashen.xiangmu.utils.HttpUrls;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class RvFragment extends Fragment {


    private RecyclerView rvFragment;
    private RvFragmentAdapter adapter;
    private RequestQueue requestQueue ;


    public RvFragment() {
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
        return inflater.inflate(R.layout.fragment_rv, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvFragment = ((RecyclerView) view.findViewById(R.id.rv_fragment));

        String shopUrl =getArguments().getString("SHOP_URL");
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                shopUrl,
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        String jsonData = response.toString();
                        RvGoodsBean rvGoodsBean = new Gson().fromJson(jsonData,RvGoodsBean.class);

                        adapter = new RvFragmentAdapter(getActivity(),rvGoodsBean);

                        rvFragment.setLayoutManager(getGridLayoutmanager());

                        rvFragment.setAdapter(adapter);

                        adapter.setItemClickedCallBack(new RvFragmentAdapter.ItemClickedCallBack() {
                            @Override
                            public void onItemClicked(String goodsUrl, String title) {
                                //在这里跳转商品详情界面
                                Intent intent = new Intent(getActivity(), TeMaiGoodsActivity.class);
                                intent.putExtra("goodsUrl",goodsUrl);
                                intent.putExtra("goodsTitle",title);
                                startActivity(intent);
                            }
                        });


                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });
        requestQueue.add(jsonObjectRequest);


    }
    private RecyclerView.LayoutManager getGridLayoutmanager() {
        return new GridLayoutManager(getActivity(),2,GridLayoutManager.VERTICAL,false);
    }
}
