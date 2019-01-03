package com.coolweather.android.gson;

/**
 * Created by b on 1/3/2019.
 */

public class AQI {

    public  AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
