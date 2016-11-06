package com.guoyang.betterPizza.material;

import com.guoyang.betterPizza.material.*;

/**
 * Created by L'Accordeur on 2016/9/26.
 */
public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Clams createClam();

}
