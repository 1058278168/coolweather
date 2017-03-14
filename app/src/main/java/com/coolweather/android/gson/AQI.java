package com.coolweather.android.gson;

/**
 * 空气质量指数
 * Created by shengli.zhang on 2017/3/14.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
