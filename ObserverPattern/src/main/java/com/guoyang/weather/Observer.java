package com.guoyang.weather;

/**
 * Created by L'Accordeur on 2016/11/6.
 */
public interface Observer {
    public void update(float temp, float humidity,float pressure);
}
