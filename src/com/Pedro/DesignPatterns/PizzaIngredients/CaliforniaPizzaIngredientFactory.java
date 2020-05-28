package com.Pedro.DesignPatterns.PizzaIngredients;

import com.Pedro.DesignPatterns.Pepperoni;
import com.Pedro.DesignPatterns.PizzaIngredients.CaliforniaPizzaIngredients.BruschettaSauce;
import com.Pedro.DesignPatterns.PizzaIngredients.CaliforniaPizzaIngredients.Calamari;
import com.Pedro.DesignPatterns.PizzaIngredients.CaliforniaPizzaIngredients.GoatCheese;
import com.Pedro.DesignPatterns.PizzaIngredients.CaliforniaPizzaIngredients.VeryThinCrustDough;
import com.Pedro.DesignPatterns.PizzaIngredients.NYPizzaIngredients.FreshClams;

public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new VeryThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new BruschettaSauce();
    }

    @Override
    public Cheese createCheese() {
        return new GoatCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Calamari()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
