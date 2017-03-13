package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by shengli.zhang on 2017/3/13.
 */

public class HttpUtil {
    /**
     * 发起http请求，只需调用sendOkHttpRequest即可
     *
     * @param address  url地址
     * @param callback 数据回调
     */
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
