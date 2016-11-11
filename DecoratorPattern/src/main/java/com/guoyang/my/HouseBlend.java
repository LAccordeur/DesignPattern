package com.guoyang.my;

/**
 * Created by L'Accordeur on 2016/11/10.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
