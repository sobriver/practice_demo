package com.example.practice_demo.net;

import okhttp3.*;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class SendHttp {
    public static void main(String[] args) {

        OkHttpClient client = new OkHttpClient();

        for (int i = 0; i < 180; i++) {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Request request = new Request
                    .Builder()
                    .url("https://www.acchw.top:9010/acc/app/mail/changePwd?email=sobriver@163.com")
                    .addHeader("token", "eyJ0eXBlIjoiSldUIiwiYWxnIjoiSFM1MTIifQ.eyJzdWIiOiI5IiwiaWF0IjoxNTk2MDA3MjI5LCJleHAiOjE1OTg1OTkyMjl9.6F9xkfM4hZc9z-Fh9LwhYQUbEFHaUn8nsyN5Zbnen3aoRtCYw2SLum7C2_wc7qpjudMaKxDdCcX26jx2OfbSSw")
                    .build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    System.out.println(e.getMessage());
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    System.out.println("success=" + response.body().string());
                }
            });

        }

    }


}
