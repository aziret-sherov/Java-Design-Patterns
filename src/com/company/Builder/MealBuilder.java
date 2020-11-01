package com.company.Builder;

public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        meal.addItem(new Pepsi());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        meal.addItem(new Coke());
        meal.addItem(new Chalap());
        return meal;
    }
}