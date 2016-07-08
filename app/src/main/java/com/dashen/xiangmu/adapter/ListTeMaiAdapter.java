package com.dashen.xiangmu.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.Volley;
import com.dashen.xiangmu.R;
import com.dashen.xiangmu.bean.ListTeMaiBean;
import com.dashen.xiangmu.utils.HttpUrls;

import java.util.List;

/**
 * Created by Administrator on 2016/6/29.
 */
public class ListTeMaiAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater inflater;
    private List<ListTeMaiBean.DataBean.ListBean> listTeMaiBean;
    private RequestQueue requestQueue;

    public ListTeMaiAdapter( Context context,ListTeMaiBean.DataBean dataBean) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        if (dataBean!=null){

            listTeMaiBean = dataBean.getList();
        }
        requestQueue = Volley.newRequestQueue(context);
    }

    @Override
    public int getCount() {
        return listTeMaiBean==null ? 0:listTeMaiBean.size();
    }

    @Override
    public Object getItem(int position) {
        return listTeMaiBean.get(position);
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
            convertView = inflater.inflate(R.layout.item_list_temai,null);
            findId(viewHolder,convertView);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = ((ViewHolder) convertView.getTag());
        }
        getObject(viewHolder,position);
        return convertView;
    }
    class ViewHolder{
        private ImageView imageListShop;
        private TextView textListShop;
        private ImageView imageListMai1;
        private TextView listZhe1;
        private TextView listYuan1;
        private ImageView imageListMai2;
        private TextView listZhe2;
        private TextView listYuan2;
        private ImageView imageListMai3;
        private TextView listZhe3;
        private TextView listYuan3;
        private TextView listTextZhe;
        private TextView listTextTotal;
        private TextView listTextTime;
        //进行监听的布局控件
        private RelativeLayout listRelativeShop;
        private FrameLayout listFrameImage1;
        private FrameLayout listFrameImage2;
        private FrameLayout listFrameImage3;
    }

    //封装找id
    public void findId(ViewHolder viewHolder,View convertView){
        viewHolder.imageListShop = ((ImageView) convertView.findViewById(R.id.image_list_shop));
        viewHolder.textListShop = ((TextView) convertView.findViewById(R.id.text_list_shop));
        viewHolder.imageListMai1 = ((ImageView) convertView.findViewById(R.id.image_list_mai1));
        viewHolder.listZhe1 = ((TextView) convertView.findViewById(R.id.list_zhe1));
        viewHolder.listYuan1 = ((TextView) convertView.findViewById(R.id.list_yuan1));
        viewHolder.imageListMai2 = ((ImageView) convertView.findViewById(R.id.image_list_mai2));
        viewHolder.listZhe2 = ((TextView) convertView.findViewById(R.id.list_zhe2));
        viewHolder.listYuan2 = ((TextView) convertView.findViewById(R.id.list_yuan2));
        viewHolder.imageListMai3 = ((ImageView) convertView.findViewById(R.id.image_list_mai3));
        viewHolder.listZhe3 = ((TextView) convertView.findViewById(R.id.list_zhe3));
        viewHolder.listYuan3 = ((TextView) convertView.findViewById(R.id.list_yuan3));
        viewHolder.listTextZhe = ((TextView) convertView.findViewById(R.id.list_text_zhe));
        viewHolder.listTextTotal = ((TextView) convertView.findViewById(R.id.list_text_total));
        viewHolder.listTextTime = ((TextView) convertView.findViewById(R.id.list_text_time));
        viewHolder.listRelativeShop = ((RelativeLayout) convertView.findViewById(R.id.list_relative_shop));
        viewHolder.listFrameImage1 = ((FrameLayout) convertView.findViewById(R.id.list_frame_imgae1));
        viewHolder.listFrameImage2 = ((FrameLayout) convertView.findViewById(R.id.list_frame_imgae2));
        viewHolder.listFrameImage3 = ((FrameLayout) convertView.findViewById(R.id.list_frame_imgae3));
    }

    //获取对象并将控件赋值
    public void getObject(final ViewHolder viewHolder, int position){

        ListTeMaiBean.DataBean.ListBean listBean = listTeMaiBean.get(position);
        String logoUrl = listBean.getBrand_logo();//店标的图片地址
        final String title = listBean.getTitle();//获取店标
        String timeEnd = "活动截止时间："+listBean.getBrand_end_time();//获取活动结束地址
        String zheKou = listBean.getBrand_discount()+"折起";//获取折扣力度
        String count = "共"+listBean.getTotal()+"款";//获取总共有多少商品

        List<ListTeMaiBean.DataBean.ListBean.GoodsListBean.ListBean1> listBean1 = listBean.getGoods_list().getList1();
        String promotion_price1 ="¥"+ listBean1.get(0).getPromotion_price();
        String price1 = "¥"+ listBean1.get(0).getPrice();
        String valueUrl1 = listBean1.get(0).getPic();
        String promotion_price2 ="¥"+ listBean1.get(1).getPromotion_price();
        String price2 = "¥"+ listBean1.get(1).getPrice();
        String valueUrl2 = listBean1.get(1).getPic();
        String promotion_price3 ="¥"+ listBean1.get(2).getPromotion_price();
        String price3 = "¥"+ listBean1.get(2).getPrice();
        String valueUrl3 = listBean1.get(2).getPic();


        viewHolder.textListShop.setText(title);
        viewHolder.listZhe1.setText(promotion_price1);
        viewHolder.listYuan1.setText(price1);
        viewHolder.listZhe2.setText(promotion_price2);
        viewHolder.listYuan2.setText(price2);
        viewHolder.listZhe3.setText(promotion_price3);
        viewHolder.listYuan3.setText(price3);
        viewHolder.listTextZhe.setText(zheKou);
        viewHolder.listTextTotal.setText(count);
        viewHolder.listTextTime.setText(timeEnd);

        //给原价设置中划线
        viewHolder.listYuan1.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        viewHolder.listYuan2.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        viewHolder.listYuan3.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);

        //创建请求下载图片
        ImageRequest imageRequestShop = new ImageRequest(
                logoUrl,
                new Response.Listener<Bitmap>() {
                    @Override
                    public void onResponse(Bitmap response) {
                        viewHolder.imageListShop.setImageBitmap(response);
                    }
                },
                200, 100, ImageView.ScaleType.FIT_CENTER, Bitmap.Config.RGB_565,
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }

        );
        ImageRequest imageRequestValue1 = new ImageRequest(
                valueUrl1,
                new Response.Listener<Bitmap>() {
                    @Override
                    public void onResponse(Bitmap response) {
                        viewHolder.imageListMai1.setImageBitmap(response);
                    }
                },
                400, 400, ImageView.ScaleType.FIT_CENTER, Bitmap.Config.RGB_565,
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }

        );
        ImageRequest imageRequestValue2 = new ImageRequest(
                valueUrl2,
                new Response.Listener<Bitmap>() {
                    @Override
                    public void onResponse(Bitmap response) {
                        viewHolder.imageListMai2.setImageBitmap(response);
                    }
                },
                400, 400, ImageView.ScaleType.FIT_CENTER, Bitmap.Config.RGB_565,
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }

        );
        ImageRequest imageRequestValue3 = new ImageRequest(
                valueUrl3,
                new Response.Listener<Bitmap>() {
                    @Override
                    public void onResponse(Bitmap response) {
                        viewHolder.imageListMai3.setImageBitmap(response);
                    }
                },
                400,400, ImageView.ScaleType.FIT_CENTER, Bitmap.Config.RGB_565,
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }

        );
        requestQueue.add(imageRequestShop);
        requestQueue.add(imageRequestValue1);
        requestQueue.add(imageRequestValue2);
        requestQueue.add(imageRequestValue3);

        //监听需要用的信息
        final String shopUrl = HttpUrls.SHOP_LV_ITEM1+listBean.getTid()+HttpUrls.SHOP_LV_ITEM2;
        final String goodsUrl1 = listBean1.get(0).getPro_url();//第一个图片的地址
        final String goodsUrl2 = listBean1.get(1).getPro_url();
        final String goodsUrl3 = listBean1.get(2).getPro_url();
        final String goods1Title = listBean1.get(0).getTitle();
        final String goods2Title = listBean1.get(1).getTitle();
        final String goods3Title = listBean1.get(2).getTitle();

        //监听的处理
        viewHolder.listRelativeShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (layoutClickListener!=null){
                    layoutClickListener.onShopClick(shopUrl,title);
                }
            }
        });
        viewHolder.listFrameImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (layoutClickListener!=null){
                    layoutClickListener.onGoods1Click(goodsUrl1,goods1Title);
                }
            }
        });
        viewHolder.listFrameImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (layoutClickListener!=null){
                    layoutClickListener.onGoods2Click(goodsUrl2,goods2Title);
                }
            }
        });
        viewHolder.listFrameImage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (layoutClickListener!=null){
                    layoutClickListener.onGoods3Click(goodsUrl3,goods3Title);
                }
            }
        });
    }
    private LayoutClickListener layoutClickListener;
    public void setLayoutClickListener(LayoutClickListener layoutClickListener){
        this.layoutClickListener = layoutClickListener;
    }
    public interface LayoutClickListener{
        public void onShopClick( String shopUrl,String title);
        public void onGoods1Click(String goodsUrl1,String title);
        public void onGoods2Click(String goodsUrl2,String title);
        public void onGoods3Click(String goodsUrl3,String title);

    }
}
