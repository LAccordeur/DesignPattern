package com.guoyang.betterPizza.store;

import com.guoyang.betterPizza.material.NYPizzaIngredientFactory;
import com.guoyang.betterPizza.material.PizzaIngredientFactory;
import com.guoyang.betterPizza.pizza.CheesePizza;
import com.guoyang.betterPizza.pizza.Pizza;

/**
 * Created by L'Accordeur on 2016/9/26.
 */
public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals("veggie")) {

        } else if (type.equals("clam")) {

        } else if (type.equals("pepperoni")) {

        }

        return pizza;
    }
}
