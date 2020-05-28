package com.Pedro.DesignPatterns;
import com.Pedro.DesignPatterns.PizzaIngredients.NYPizzaIngredientFactory;
import com.Pedro.DesignPatterns.PizzaIngredients.PizzaIngredientFactory;
import com.Pedro.DesignPatterns.PizzaStyles.CheesePizza;
import com.Pedro.DesignPatterns.PizzaStyles.ClamPizza;
import com.Pedro.DesignPatterns.PizzaStyles.PepperoniPizza;
import com.Pedro.DesignPatterns.PizzaStyles.VeggiePizza;

public class NYPizzaStore extends PizzaStore {


    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }

        return pizza;
    }

}
