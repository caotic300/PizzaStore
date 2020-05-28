package com.Pedro.DesignPatterns.PizzaStyles;

import com.Pedro.DesignPatterns.Pizza;
import com.Pedro.DesignPatterns.PizzaIngredients.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        veggies = pizzaIngredientFactory.createVeggies();
    }
}


