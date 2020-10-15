package com.example.practice_demo.net;

import okhttp3.*;
import org.apache.tomcat.jni.Local;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class SendHttp {
    public static void main(String[] args) {
        SendHttp http = new SendHttp();
//        Ty ty = new Ty();
//        System.out.println(ty.hashCode());
//        http.t1(ty);
//        System.out.println(ty.hashCode());




        LocalDateTime localDateTime = LocalDateTime.of(2004, 2, 29, 12, 12);
        System.out.println(localDateTime);
    }

    public void t2(LocalDateTime dateTime){
        dateTime = LocalDateTime.of(2020, 1, 1, 1, 1);
    }


    public void t1(Ty s1){
        s1 = new Ty();
        System.out.println("----" + s1.hashCode());
    }


    static class Ty {

    }










    public static void get() {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request
                .Builder()
                .url("https://gw.datayes.com/rrp_mammon/web/feed/list")
                .addHeader("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/85.0.4183.121 Safari/537.36")
                .addHeader("cookie", "_ga=GA1.2.581967736.1602557163; _gid=GA1.2.1811171065.1602557163; _gat=1; gr_user_id=4d04fdb4-8358-44f3-ad8b-a96c3322fd75; ba895d61f7404b76_gr_session_id=7cea5bbc-de38-48bb-a152-457b1d029854; UM_distinctid=1751fd9b97e76c-00fdb0436e697a-333376b-1fa400-1751fd9b97f713; ba895d61f7404b76_gr_session_id_7cea5bbc-de38-48bb-a152-457b1d029854=true; grwng_uid=c4ad9874-c8a6-4882-9c81-2d35303be197; cloud-sso-token=889EB3775C96CB7C1491AF99E29C706B; cloud-anonymous-token=99d045c627e740eab1816904e896099e")
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

    public void post() {
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
