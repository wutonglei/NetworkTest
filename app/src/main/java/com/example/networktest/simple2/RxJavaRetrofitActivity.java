package com.example.networktest.simple2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.fastjson.JSON;
import com.example.networktest.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;

public class RxJavaRetrofitActivity extends AppCompatActivity {
    private static final String TAG = "RxJavaRetrofitActivity";
    @BindView(R.id.btn_normal)
    Button btnNormal;
    @BindView(R.id.btn_normal2)
    Button btnNormal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rx_java_retrofit);
        ButterKnife.bind(this);


    }
//android.os.NetworkOnMainThreadException
    @OnClick({R.id.btn_normal, R.id.btn_normal2})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_normal:

                RetrofitClient.getServiceApi().getUserArticle_Path("1")
                        .subscribeOn(Schedulers.io())
                        .subscribe(new Consumer<ResponseBody>() {
                            @Override
                            public void accept(ResponseBody responseBody) throws Exception {
                                Log.i(TAG, "accept: " + responseBody.string());
                            }
                        }, new Consumer<Throwable>() {
                            @Override
                            public void accept(Throwable throwable) throws Exception {
                                Log.i(TAG, "accept: " + throwable.getMessage());
                            }
                        });

                break;
            case R.id.btn_normal2:

                RetrofitClient.getServiceApi().postLogin_Field("616302953@qq.com", "q030406120")
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .map(new Function<ResponseBody, LoginBean>() {

                            @Override
                            public LoginBean apply(ResponseBody responseBody) throws Exception {
                                String s = responseBody.string();
                                Log.i(TAG, "apply: " + s);
                                LoginBean loginBean = JSON.parseObject(s, LoginBean.class);
                                return loginBean;
                            }
                        }).subscribe(new Consumer<LoginBean>() {
                    @Override
                    public void accept(LoginBean loginBean) throws Exception {
                        Log.i(TAG, "accept: " + loginBean.toString());
                    }
                });
                break;
        }
    }
}
