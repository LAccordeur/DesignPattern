package com.guoyang.my;

/**
 * Created by L'Accordeur on 2016/11/10.
 */
public class nyStarbuzz {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
