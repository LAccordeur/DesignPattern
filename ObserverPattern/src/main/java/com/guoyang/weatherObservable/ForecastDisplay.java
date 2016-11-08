package com.guoyang.weatherObservable;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by guoyang on 2016/11/8.
 */
public class ForecastDisplay implements Observer, DisplayElement{

    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        observable.addObserver(this);
    }

    public void display() {
        System.out.println("Last pressure is " + lastPressure + " and current pressure is " + currentPressure);
    }

    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)o;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }
}
