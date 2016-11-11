package com.guoyang.my;

/**
 * Created by L'Accordeur on 2016/11/10.
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 2.99;
    }
}
