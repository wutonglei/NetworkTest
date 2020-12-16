package com.example.networktest.simple2;

import com.example.networktest.simple1.UserArticleBean;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface WanandroidService2 {


    //    https://wanandroid.com/user_article/list/页码/json
    @GET("user_article/list/{page}/json")
    Observable<ResponseBody> getUserArticle_Path(@Path("page") String page);

    @GET("user_article/list/{page}/json")
    Call<ResponseBody> getUserArticle_Path_Int(@Path("page") Integer page);

//    自定义的没弄 要试试的
    @GET("user_article/list/{page}/json")
    Call<UserArticleBean> getUserArticle_Gson(@Path("page") String page);


    @GET("article/list/0/json")
    Call<ResponseBody> getArticle_Query(@Query("cid") int cid);

    //    另一个随便写
    @GET("article/list/0/json")
    Call<ResponseBody> getArticle_QueryMap(@QueryMap Map<String, Integer> cid);

    //    Field FieldMap需要和@FormUrlEncoded配合使用
//    @FormUrlEncoded
//    以form表单方式上传
//    我看过来好像都是post
//    www.wanandroid.com/user/login?username=616302953@qq.com&password=q030406120
    @FormUrlEncoded
    @POST("user/login")
    Observable<ResponseBody> postLogin_Field(@Field("username") String username, @Field("password") String password);

    @FormUrlEncoded
    @POST("user/login")
    Call<ResponseBody> postLogin_FieldMap(@FieldMap Map<String, String> namePassword);


//
//    @Part  文件上传  @PartMap 多文件上传

//    @Streaming下载大文件


}
