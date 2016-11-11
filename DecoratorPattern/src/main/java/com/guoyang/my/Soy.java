package com.guoyang.my;

/**
 * Created by L'Accordeur on 2016/11/10.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public double cost() {
        return 0;
    }
}
