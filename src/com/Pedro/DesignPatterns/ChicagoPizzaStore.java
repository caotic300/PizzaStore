package com.Pedro.DesignPatterns;

import com.Pedro.DesignPatterns.PizzaIngredients.ChicagoPizzaIngredientFactory;
import com.Pedro.DesignPatterns.PizzaIngredients.PizzaIngredientFactory;
import com.Pedro.DesignPatterns.PizzaStyles.CheesePizza;
import com.Pedro.DesignPatterns.PizzaStyles.ClamPizza;
import com.Pedro.DesignPatterns.PizzaStyles.PepperoniPizza;
import com.Pedro.DesignPatterns.PizzaStyles.VeggiePizza;


public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName("Clicago Style Pepperoni Pizza");
        }

        return pizza;
    }
}


