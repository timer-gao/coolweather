package com.evolab.gaomj.coolweather.gson;


import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by evolab-gmj on 2017/4/8.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
