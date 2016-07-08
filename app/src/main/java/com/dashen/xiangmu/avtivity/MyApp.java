package com.dashen.xiangmu.avtivity;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.activeandroid.ActiveAndroid;

/**
 * Created by Administrator on 2016/6/27.
 */
public class MyApp extends Application {
    public static Context context;

    public static final String shref_filename = "config";
    public static final String IS_FIRST_LOGIN = "isfirstlogin";

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        ActiveAndroid.initialize(this);
    }

    public static boolean isFirstLogin(){
        SharedPreferences sharedPreferences = context.getSharedPreferences(shref_filename,Context.MODE_PRIVATE);
        boolean isFirstLogin = sharedPreferences.getBoolean(IS_FIRST_LOGIN,true);
        if (isFirstLogin){
            sharedPreferences.edit().putBoolean(IS_FIRST_LOGIN,false).apply();
        }
        return isFirstLogin;
    }
}
