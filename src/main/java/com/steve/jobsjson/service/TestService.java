package com.steve.jobsjson.service;

import com.steve.jobsjson.util.RateLimiterDemo;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.util.Date;

public class TestService {

    class Invoke implements Runnable{

        private final int age;

        public Invoke(int age){
            this.age = age;
        }

        @Override
        public void run() {
            OkHttpClient mOkHttpClient = new OkHttpClient();
            Request request = new Request.Builder()
                    .url("http://10.0.0.2:1024/company/one?name=steve&age="+age+"&sex=true")
                    .build();
            long start = System.currentTimeMillis();
            System.out.println("开始请求时间: " + new Date());
            Call mcall= mOkHttpClient.newCall(request);
            try(Response response = mcall.execute()) {
                System.out.println("响应时间: " + (System.currentTimeMillis() - start) + " ms");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

//    public static void insert(int age) {
//        OkHttpClient mOkHttpClient = new OkHttpClient();
//        System.out.println("开始请求");
//        Request request = new Request.Builder()
//                .url("http://10.0.0.2:1024/company/one?name=steve&age="+age+"&sex=true")
//                .build();
//        long start = System.currentTimeMillis();
//        Call mcall= mOkHttpClient.newCall(request);
//        try {
//            Response response = mcall.execute();
//            System.out.println("响应时间: " + (System.currentTimeMillis() - start) + " ms");
//            System.out.println(response.body().string());
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) {
        RateLimiterDemo rateLimiter = RateLimiterDemo.create(2);
        for(int i=0;i<10;i++){
            rateLimiter.acquire();
            System.out.println(new Date());
        }
    }
}
