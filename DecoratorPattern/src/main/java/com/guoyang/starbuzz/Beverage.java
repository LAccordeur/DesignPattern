package com.guoyang.starbuzz;

/**
 * Created by L'Accordeur on 2016/11/10.
 */
public abstract  class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();

}
