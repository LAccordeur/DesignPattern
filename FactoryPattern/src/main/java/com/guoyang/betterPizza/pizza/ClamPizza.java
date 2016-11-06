package com.guoyang.betterPizza.pizza;

import com.guoyang.betterPizza.material.PizzaIngredientFactory;

/**
 * Created by L'Accordeur on 2016/9/26.
 */
public class ClamPizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        dough.display();
        sauce = pizzaIngredientFactory.createSauce();
        sauce.display();
        cheese = pizzaIngredientFactory.createCheese();
        cheese.display();
        clam = pizzaIngredientFactory.createClam();
        clam.display();
    }
}
