package com.evolab.gaomj.coolweather.gson;

/**
 * Created by evolab-gmj on 2017/4/7.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
