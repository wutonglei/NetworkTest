package com.example.networktest;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.networktest.simple1.UserArticleBean;
import com.example.networktest.simple1.WanandroidService;
import com.example.networktest.simple2.RxJavaRetrofitActivity;

import java.io.IOException;
import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.Result;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * simple1 简单但是全面的使用
 * simple2  封装  +rxjava
 *
 * <p>
 * 注意：
 * body："+response.body()+"onResponse:string "+response.body().string()  body是类  string才是数据
 * <p>
 * int一样的效果
 * Call<ResponseBody> getUserArticle_Path(@Path("page") String page);
 * Call<ResponseBody> getUserArticle_Path_Int(@Path("page") int page);
 * <p>
 * response.body().string() 只能读取一次  估计是缓存的 一次读取后就没了
 */
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_content)
    TextView tvContent;
    @BindView(R.id.btn_path)
    Button btnPath;
    @BindView(R.id.btn_path_int)
    Button btnPathInt;
    @BindView(R.id.btn_gson)
    Button btnGson;
    @BindView(R.id.btn_query)
    Button btnQuery;
    @BindView(R.id.btn_querymap)
    Button btnQuerymap;
    @BindView(R.id.btn_filed)
    Button btnFiled;
    @BindView(R.id.btn_filedmap)
    Button btnFiledmap;

    Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        retrofit = new Retrofit.Builder()
                .baseUrl("https://www.wanandroid.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        wanandroidService = retrofit.create(WanandroidService.class);

    }

    WanandroidService wanandroidService;
    private static final String TAG = "MainActivity";

    @OnClick({R.id.btn_path, R.id.btn_path_int, R.id.btn_gson, R.id.btn_query, R.id.btn_querymap, R.id.btn_filed, R.id.btn_filedmap, R.id.btn_open})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_path:
                wanandroidService.getUserArticle_Path("1")
                        .enqueue(new Callback<ResponseBody>() {
                            @Override
                            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                                Log.i(TAG, "onResponse: " + response.toString());
                                Log.i(TAG, "onResponse: " + response.message());
                                Log.i(TAG, "onResponse: " + response.body());
                                try {
                                    Log.i(TAG, "onResponse:  body：" + response.body() + "onResponse:string " + response.body().string());
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }

                            }

                            @Override
                            public void onFailure(Call<ResponseBody> call, Throwable t) {
                                Log.i(TAG, "onFailure: " + t.getMessage());
                            }
                        });
                break;
            case R.id.btn_path_int:
                wanandroidService.getUserArticle_Path_Int(1)
                        .enqueue(new Callback<ResponseBody>() {
                            @Override
                            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                                try {
                                    Log.i(TAG, "onResponse:  body：" + response.body() + "onResponse:string " + response.body().string());
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }

                            }

                            @Override
                            public void onFailure(Call<ResponseBody> call, Throwable t) {
                                Log.i(TAG, "onFailure: " + t.getMessage());
                            }
                        });
                break;
            case R.id.btn_gson:
                wanandroidService.getUserArticle_Gson("1")
                        .enqueue(new Callback<UserArticleBean>() {


                            @Override
                            public void onResponse(Call<UserArticleBean> call, Response<UserArticleBean> response) {
                                UserArticleBean body = response.body();
                                Log.i(TAG, "onResponse: " + response.toString());
                                Log.i(TAG, "onResponse: " + response.message());
                                Log.i(TAG, "onResponse: " + body.toString());
                            }

                            @Override
                            public void onFailure(Call<UserArticleBean> call, Throwable t) {
                                Log.i(TAG, "onFailure: " + t.getMessage());
                            }

                        });
                break;
            case R.id.btn_query:
                wanandroidService.getArticle_Query(1)
                        .enqueue(new Callback<ResponseBody>() {
                            @Override
                            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                                try {
                                    Log.i(TAG, "onResponse:  body：" + response.body() + "onResponse:string " + response.body().string());
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }

                            }

                            @Override
                            public void onFailure(Call<ResponseBody> call, Throwable t) {
                                Log.i(TAG, "onFailure: " + t.getMessage());
                            }
                        });
                break;
            case R.id.btn_querymap:
                HashMap<String, Integer> map = new HashMap<>();
                map.put("cid", 1);
                map.put("cidx", 1);
                wanandroidService.getArticle_QueryMap(map)
                        .enqueue(new Callback<ResponseBody>() {
                            @Override
                            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                                try {
                                    Log.i(TAG, "onResponse:  body：" + response.body() + "onResponse:string " + response.body().string());
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }

                            }

                            @Override
                            public void onFailure(Call<ResponseBody> call, Throwable t) {
                                Log.i(TAG, "onFailure: " + t.getMessage());
                            }
                        });
                break;
            case R.id.btn_filed:
//                注意这个是有返回值的  只能读取一次

                wanandroidService.postLogin_Field("616302953@qq.com", "q030406120")
                        .enqueue(new Callback<ResponseBody>() {
                            @Override
                            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                                try {

                                    Log.i(TAG, "onResponse:  body：" + response.body() + "onResponse:string：" + response.body().string());
                                    tvContent.setText(response.body().string());
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }

                            @Override
                            public void onFailure(Call<ResponseBody> call, Throwable t) {
                                Log.i(TAG, "onFailure: " + t.getMessage());
                            }
                        });
                break;
            case R.id.btn_filedmap:
                break;
            case R.id.btn_open:
                Intent intent=new Intent(this, RxJavaRetrofitActivity.class);
                startActivity(intent);
                break;


        }
    }
}

/**
 * {
 * "data": {
 * "admin": false,
 * "chapterTops": [
 * <p>
 * ],
 * "coinCount": 0,
 * "collectIds": [
 * <p>
 * ],
 * "email": "",
 * "icon": "",
 * "id": 83522,
 * "nickname": "616302953@qq.com",
 * "password": "",
 * "publicName": "616302953@qq.com",
 * "token": "",
 * "type": 0,
 * "username": "616302953@qq.com"
 * },
 * "errorCode": 0,
 * "errorMsg": ""
 * }
 */
