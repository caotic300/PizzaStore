package com.Pedro.DesignPatterns;

import com.Pedro.DesignPatterns.PizzaIngredients.*;

public abstract class Pizza {
  protected String name;
  protected Dough dough;
  protected Sauce sauce;
  protected Cheese cheese;
  protected Pepperoni pepperoni;
  protected Clams clam;
  protected Veggies veggies[];


  public abstract void prepare();
  public void bake() {
    System.out.println("Bake for 25 minutes at 350");
  }
  public void cut() {
    System.out.println("Cutting the pizza into dia");
  }
  public void box() {
    System.out.println("Place pizza in official PizzaStore box");
  }
  public void setName(String name) {
      this.name = name;
  }
  public String getName() {
    return name;
  }

    @Override
    public String toString() {
        return super.toString();
    }


}
