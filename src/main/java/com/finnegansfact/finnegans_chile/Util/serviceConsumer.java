package com.finnegansfact.finnegans_chile.Util;

import java.io.IOException;

import org.springframework.stereotype.Component;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

@Component
public class serviceConsumer {
    
    public String ejecutarServicio_get(String url){
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
        .url(url)
        .get()
        .addHeader("cache-control", "no-cache")
        .build();
        try{
            Response response = client.newCall(request).execute();
            return response.body().string();
        }catch(Exception e){
            return null ;
        }
        
    }

    public String ejecutarServicio_post(String json, String url){
        OkHttpClient client = new OkHttpClient();        
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(json, mediaType); 

        Request request = new Request.Builder()
        .url(url)
        .post(body)
        .addHeader("content-type", "application/json")
        .addHeader("cache-control", "no-cache")
        .build();
        try {
            Response response = client.newCall(request).execute();
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //String result = response.body().string(); 
        return null;
    }
}
