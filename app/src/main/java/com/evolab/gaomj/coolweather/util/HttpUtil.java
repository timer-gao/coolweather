package com.evolab.gaomj.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by evolab-gmj on 2017/4/7.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callBack){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callBack);
    }

}
