package com.guoyang.pizza;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		
		if (type.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		} else if (type.equals("pepperoni")) {
			
		} else if (type.equals("clam")) {
			
		} else if (type.equals("veggie")) {
			
		}
		
		return null;
	}

}
