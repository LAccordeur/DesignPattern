package com.guoyang.beverage.after;

/**
 * Created by L'Accordeur on 2016/12/3.
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

}
