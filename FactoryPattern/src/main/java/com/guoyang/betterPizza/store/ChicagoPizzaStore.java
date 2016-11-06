package com.guoyang.betterPizza.store;

import com.guoyang.betterPizza.material.ChicagoPizzaIngredientFactory;
import com.guoyang.betterPizza.pizza.CheesePizza;
import com.guoyang.betterPizza.pizza.Pizza;

/**
 * Created by L'Accordeur on 2016/9/26.
 */
public class ChicagoPizzaStore extends PizzaStore {
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        ChicagoPizzaIngredientFactory chicagoPizzaIngredientFactory = new ChicagoPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(chicagoPizzaIngredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        }
        return pizza;
    }
}
