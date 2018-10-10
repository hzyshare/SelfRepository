package com.huzy.hubaselibrary;

import android.app.Application;

import com.tencent.mmkv.MMKV;
import com.zhy.http.okhttp.OkHttpUtils;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

/**
 * 项目名称：HuBaseWorkApp
 * 创建人：huzy
 * 创建时间:2018/9/28 11:37
 */
public class HuApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(5000L, TimeUnit.MILLISECONDS)       //连接超时时间
                .readTimeout(5000L,TimeUnit.MILLISECONDS)         //读取超时时间
                .build();

        OkHttpUtils.initClient(okHttpClient);
    }
}
