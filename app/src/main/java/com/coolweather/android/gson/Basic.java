package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 城市天气更新时间
 * Created by shengli.zhang on 2017/3/14.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
