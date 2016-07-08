package com.dashen.xiangmu.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.dashen.xiangmu.R;

/**
 * Created by Administrator on 2016/6/28.
 */
public class CustomToolBar extends RelativeLayout {
    private Drawable leftImage;
    private Drawable rightImage;
    private String myTitleText;
    private float myTitleSize;
    private int myTitleColor;
    private TextView myTitleTextView;
    private ImageView leftImageView;
    private ImageView rightImageView;

    public void setMyTitleText(String title){
        myTitleTextView.setText(title);
    }

    public CustomToolBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        //通过context获得无类型数组
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomToolBar);
        //通过无类型数组获取所有的自定义属性的值
        leftImage = typedArray.getDrawable(R.styleable.CustomToolBar_leftImage);
        rightImage = typedArray.getDrawable(R.styleable.CustomToolBar_rightImage);
        myTitleText = typedArray.getString(R.styleable.CustomToolBar_myTitleText);
        myTitleSize = typedArray.getDimension(R.styleable.CustomToolBar_myTitleSize,20.0f);
        myTitleColor = typedArray.getColor(R.styleable.CustomToolBar_myTitleColor, Color.BLACK);
        typedArray.recycle();
        /**
         * 分别初始化三个UI控件，并设置相应的属性值
         */
        myTitleTextView = new TextView(context);
        myTitleTextView.setText(myTitleText);
        myTitleTextView.setTextSize(myTitleSize);
        myTitleTextView.setTextColor(myTitleColor);
        leftImageView = new ImageView(context);
        leftImageView.setImageDrawable(leftImage);
        rightImageView = new ImageView(context);
        rightImageView.setImageDrawable(rightImage);
        /**
         * 将三个UI控件摆放在正确的位置
         */
        RelativeLayout.LayoutParams centerParams = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        centerParams.addRule(CENTER_IN_PARENT);
        myTitleTextView.setLayoutParams(centerParams);

        RelativeLayout.LayoutParams leftParams = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
        leftParams.addRule(ALIGN_PARENT_LEFT);
        leftParams.addRule(CENTER_VERTICAL);

        leftImageView.setLayoutParams(leftParams);

        RelativeLayout.LayoutParams rightParams = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
        rightParams.addRule(ALIGN_PARENT_RIGHT);
        rightParams.addRule(CENTER_VERTICAL);
        rightImageView.setLayoutParams(rightParams);

        addView(myTitleTextView);
        addView(leftImageView);
        addView(rightImageView);

        leftImageView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgCLickListener!=null){
                    imgCLickListener.onLeftImgClick(v);
                }
            }
        });
        rightImageView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgCLickListener!=null){
                    imgCLickListener.onRightImgClick(v);
                }
            }
        });
    }

    private ImgCLickListener imgCLickListener;
    public void setImgClickListener(ImgCLickListener imgCLickListener){
        this.imgCLickListener = imgCLickListener;
    }
    public interface ImgCLickListener{
        public void onLeftImgClick(View view);
        public void onRightImgClick(View view);
    }
}
