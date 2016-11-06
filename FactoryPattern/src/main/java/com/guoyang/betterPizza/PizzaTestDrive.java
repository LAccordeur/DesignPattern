package com.guoyang.betterPizza;

import com.guoyang.betterPizza.pizza.Pizza;
import com.guoyang.betterPizza.store.ChicagoPizzaStore;
import com.guoyang.betterPizza.store.NYPizzaStore;
import com.guoyang.betterPizza.store.PizzaStore;

/**
 * Created by uestc on 16/9/26.
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        PizzaStore cStore = new ChicagoPizzaStore();
        pizza = cStore.orderPizza("cheese");
        System.out.println("Atom ordered a " + pizza.getName() + "\n");
    }
}
