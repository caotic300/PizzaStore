package com.Pedro.DesignPatterns;

import com.Pedro.DesignPatterns.PizzaIngredients.CaliforniaPizzaIngredientFactory;
import com.Pedro.DesignPatterns.PizzaIngredients.PizzaIngredientFactory;
import com.Pedro.DesignPatterns.PizzaStyles.CheesePizza;
import com.Pedro.DesignPatterns.PizzaStyles.ClamPizza;
import com.Pedro.DesignPatterns.PizzaStyles.PepperoniPizza;
import com.Pedro.DesignPatterns.PizzaStyles.VeggiePizza;


public class CaliforniaPizzaStore extends PizzaStore {

    @Override
   protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new CaliforniaPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("California Styled Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(pizzaIngredientFactory);
            pizza.setName("California Styled Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("California Styled Clam Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName("California Styled Peperoni Pizza");
        }
        return pizza;
    }
}
