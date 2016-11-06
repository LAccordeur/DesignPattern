package com.guoyang.weather;

/**
 * Created by L'Accordeur on 2016/11/6.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
//    private Subject weatherDate;

    public CurrentConditionsDisplay(Subject weatherDate) {
//        this.weatherDate = weatherDate;
        weatherDate.registerObserver(this);
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
        + "F degrees and " + humidity + "% humidity");
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
