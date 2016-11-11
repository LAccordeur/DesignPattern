package com.guoyang.my;

/**
 * Created by L'Accordeur on 2016/11/10.
 */
public abstract class Beverage {

    String description;

    public abstract double cost();

    public String getDescription() {
        return this.description;
    }
}
