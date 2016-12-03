package com.guoyang.beverage.after;

/**
 * Created by L'Accordeur on 2016/12/3.
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
