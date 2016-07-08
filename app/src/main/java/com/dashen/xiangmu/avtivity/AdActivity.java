package com.dashen.xiangmu.avtivity;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.dashen.xiangmu.R;

public class AdActivity extends AppCompatActivity {

    private TextView countTime;
    private int count = 5;
    private int duration = 1000;
    private static final int TURN_MSG = 0x11;
    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case TURN_MSG:
                    count--;
                    countTime.setText(count + "秒，点击跳过");
                    if (count<=0){//跳转界面，先移除消息
                        if (handler.hasMessages(TURN_MSG))
                            handler.removeMessages(TURN_MSG);
                        if (MyApp.isFirstLogin()){
                            startActivity(new Intent(AdActivity.this,WelcomeActivity.class));
                        }else {
                            startActivity(new Intent(AdActivity.this,MainActivity.class));
                        }
                        finish();
                    }else {
                        handler.sendEmptyMessageDelayed(TURN_MSG,duration);
                    }
                    break;
            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad);
        countTime = ((TextView) findViewById(R.id.count_time));
        countTime.setText(count + "秒，点击跳过");
        handler.sendEmptyMessage(TURN_MSG);
    }

    public void btnStartAd(View view) {
        if (handler.hasMessages(TURN_MSG))
            handler.removeMessages(TURN_MSG);
        if (MyApp.isFirstLogin()){
            startActivity(new Intent(AdActivity.this,WelcomeActivity.class));
        }else {
            startActivity(new Intent(AdActivity.this,MainActivity.class));
        }
        finish();
    }
}
