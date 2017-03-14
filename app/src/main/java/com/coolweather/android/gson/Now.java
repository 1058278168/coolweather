package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 温度和天气
 * Created by shengli.zhang on 2017/3/14.
 */


public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
