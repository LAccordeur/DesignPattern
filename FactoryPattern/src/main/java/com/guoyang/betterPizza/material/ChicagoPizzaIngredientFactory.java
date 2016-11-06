package com.guoyang.betterPizza.material;

/**
 * Created by L'Accordeur on 2016/9/26.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        Veggies[] veggies = new Veggies[]{new Onion(),new Mushroom()};
        return veggies;
    }

    public Clams createClam() {
        return new FrozenClams();
    }

}
