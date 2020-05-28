package com.Pedro.DesignPatterns.PizzaIngredients;

import com.Pedro.DesignPatterns.*;

public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
 }
