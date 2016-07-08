package com.dashen.xiangmu.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.Volley;
import com.dashen.xiangmu.R;
import com.dashen.xiangmu.bean.RvGoodsBean;

import java.util.List;

/**
 * Created by Administrator on 2016/7/1.
 */
public class RvFragmentAdapter extends RecyclerView.Adapter<RvFragmentAdapter.RvViewHolder> {
     private Context context;
     private List<RvGoodsBean.DataBean.ListBean.ProductsBean.ListBean1> mList;
     private LayoutInflater inflater;
     private RequestQueue requestQueue;
    private int screenWidth;
     public RvFragmentAdapter(Context context,RvGoodsBean bean) {
         this.context = context;
         if (bean!=null){
             mList = bean.getData().getList().getProducts().getList();
             Log.i("123", "bean is: "+bean.toString());
             Log.i("123", "mList的大小: "+mList.size());
         }
         inflater = LayoutInflater.from(context);
         requestQueue = Volley.newRequestQueue(context);
         screenWidth = context.getResources().getDisplayMetrics().widthPixels;

     }
    @Override
    public RvViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.item_rv_fragment,null);
        return new RvViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final RvViewHolder holder, int position) {
        //获取出来一个实体类对象
        RvGoodsBean.DataBean.ListBean.ProductsBean.ListBean1 listBean1 = mList.get(position);
        String imageUrlValue = listBean1.getPic();//商品图片
        final String textTitle = listBean1.getTitle();//商品标题
        double textZhe = listBean1.getPromotion_price();//打折后的价格
        double textYuan = listBean1.getPrice();//打折之前的价格
        String site = listBean1.getSite();//获取出是天猫还是淘宝
        double cent = listBean1.getCommission_cent();//获取到可以得到多少集分宝
        double isrec = listBean1.getIsrec();//该值是1显示拍下改价，是-1就显示灰色的原件
        double type = listBean1.getIcon_top_left();//只要该值为2显示最新图片，否则不显示
        final String goodsUrl = listBean1.getPro_url();//获取商品的连接  通过接口回调传给详情界面
        holder.rvTextTitle.setText(textTitle);
        holder.rvTextZhe.setText("¥"+textZhe);

        if (isrec == -1){
            holder.rvTextYuan.setText("¥"+textYuan);
            holder.rvTextYuan.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        }else {
            holder.rvTextYuan.setText("拍下改价");
            holder.rvTextYuan.setBackgroundColor(Color.parseColor("#08F128"));
        }
        holder.rvTextFen.setText("送"+cent+"集分宝");
        holder.rvTextSite.setText(site);
        if (site.equals("天猫")){
            holder.rvImageSite.setImageResource(R.mipmap.icon_tianmao);
        }else {
            holder.rvImageSite.setImageResource(R.mipmap.icon_taobao);
        }
        if (type==2){
            holder.rvImageZuiXin.setVisibility(View.VISIBLE);
        }
        ImageRequest imageRequest = new ImageRequest(imageUrlValue,
                new Response.Listener<Bitmap>() {
                    @Override
                    public void onResponse(Bitmap response) {
                        holder.rvImageValue.setImageBitmap(response);

                    }
                },
                (screenWidth-20)/2, (screenWidth-20)/2, ImageView.ScaleType.FIT_XY, Bitmap.Config.RGB_565,
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });
        requestQueue.add(imageRequest);
        //如果不对数据源增加或者删除，可以用这种，如果涉及到增加或者删除某一项，会导致顺序出现问题
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (itemClickedCallBack!=null){
                    itemClickedCallBack.onItemClicked(goodsUrl,textTitle);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList==null? 0:mList.size();
    }

    public class RvViewHolder extends RecyclerView.ViewHolder {
        private ImageView rvImageValue;
        private ImageView rvImageZuiXin;
        private TextView rvTextTitle;
        private TextView rvTextZhe;
        private TextView rvTextYuan;
        private ImageView rvImageSite;
        private TextView rvTextSite;
        private TextView rvTextFen;

        public RvViewHolder(View itemView) {
            super(itemView);
            rvImageValue = ((ImageView) itemView.findViewById(R.id.rv_image_value));
            rvImageZuiXin = ((ImageView) itemView.findViewById(R.id.rv_image_zuixin));
            rvTextTitle = ((TextView) itemView.findViewById(R.id.rv_text_title));
            rvTextZhe = ((TextView) itemView.findViewById(R.id.rv_text_zhe));
            rvTextYuan = ((TextView) itemView.findViewById(R.id.rv_text_yuan));
            rvImageSite = ((ImageView) itemView.findViewById(R.id.rv_image_site));
            rvTextSite = (TextView) itemView.findViewById(R.id.rv_text_site);
            rvTextFen = ((TextView) itemView.findViewById(R.id.rv_text_fen));
        }
    }

    //通过接口回调吧商品的标题和连接都传出去

    private ItemClickedCallBack itemClickedCallBack;
    public void setItemClickedCallBack(ItemClickedCallBack itemClickedCallBack){
        this.itemClickedCallBack = itemClickedCallBack;
    }
    public interface ItemClickedCallBack{
        public void onItemClicked(String goodsUrl,String title);
    }




}
