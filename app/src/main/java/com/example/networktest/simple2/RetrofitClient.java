package com.example.networktest.simple2;

import android.util.Log;

import com.example.networktest.simple1.WanandroidService;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private final  static WanandroidService2 serviceApi;

    static {
        OkHttpClient okHttpClient = new OkHttpClient
                .Builder()
                .addInterceptor(new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
                    @Override
                    public void log(String message) {
                        Log.e("TAG",message);
                    }
                }).setLevel(HttpLoggingInterceptor.Level.BODY))
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                // 访问后台接口的主路径
                .baseUrl("https://www.wanandroid.com/")
                // 添加解析转换工厂,Gson 解析，Xml解析，等等
                .addConverterFactory(GsonConverterFactory.create())
                // 添加 OkHttpClient,不添加默认就是 光杆 OkHttpClient
                .client(okHttpClient)
                // 支持RxJava Call -> Obsevrable 怎么做到的？ 1 2  采用了 Adapter 设计模式
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        // 创建一个 实例对象
        serviceApi = retrofit.create(WanandroidService2.class);
    }

    public static WanandroidService2 getServiceApi() {
        return serviceApi;
    }


}
