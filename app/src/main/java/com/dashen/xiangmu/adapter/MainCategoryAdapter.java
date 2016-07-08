package com.dashen.xiangmu.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.Volley;
import com.dashen.xiangmu.R;
import com.dashen.xiangmu.bean.MainCatedoryBean;

import java.util.List;

/**
 * Created by Administrator on 2016/7/5.
 */
public class MainCategoryAdapter extends BaseAdapter {
    private Context context;
    private List<MainCatedoryBean.DataBean.AllTypeBean.ListBean> mList;
    private RequestQueue requestQueue;

    public MainCategoryAdapter(Context context, MainCatedoryBean mainCatedoryBean) {
        this.context = context;
        this.mList = mainCatedoryBean.getData().getAll_type().getList();
        requestQueue = Volley.newRequestQueue(context);
    }
    @Override
    public int getCount() {
        return mList==null ? 0:mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView==null){
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.item_gv_category_main,null);
            viewHolder.imageView = (ImageView) convertView.findViewById(R.id.gv_image_main);
            viewHolder.textView = (TextView) convertView.findViewById(R.id.gv_text_main);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        MainCatedoryBean.DataBean.AllTypeBean.ListBean bean = mList.get(position);
        String imgUrl = bean.getApp_picurl();
        String title = bean.getTitle();
        viewHolder.textView.setText(title);
        final ViewHolder viewHolder1 = viewHolder;
        ImageRequest imageRequest = new ImageRequest(imgUrl,
                new Response.Listener<Bitmap>() {
                    @Override
                    public void onResponse(Bitmap response) {
                        viewHolder1.imageView.setImageBitmap(response);
                    }
                }, 68, 68, ImageView.ScaleType.FIT_XY, Bitmap.Config.RGB_565,
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });
        requestQueue.add(imageRequest);

        return convertView;
    }
    class ViewHolder{
        private ImageView imageView;
        private TextView textView;
    }
}
