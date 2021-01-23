package com.pvermillion.design.pattern.builder.meal.objects;

import com.pvermillion.basic.Basic;

public class MealBuilder {

    public Meal prepareVeggieMeal() {
        Basic.getLogger().info("Preparing Veggie meal...");
        return new Meal()
            .addItem(new VeggieBurger())
            .addItem(new Coke());
    }

    public Meal prepareChickenMeal() {
        Basic.getLogger().info("Preparing Chicken meal...");
        return new Meal()
            .addItem(new ChickenBurger())
            .addItem(new Pepsi());
    }

    public Meal prepareVeggieChickenBurgerMeal() {
        Basic.getLogger().info("Preparing Veggie Chicken Burger meal...");
        return new Meal()
            .addItem(new VeggieBurger())
            .addItem(new ChickenBurger());
    }

    public Meal prepare100VeggieBurgerMeal() {
        Basic.getLogger().info("Preparing 100 Veggie Burger meal...");
        Meal meal = new Meal();
            for(int i = 0; i < 100; i++) {
                meal.addItem(new VeggieBurger());
            }
        return meal;
    }

    public Meal preparePepsiCokeMeal() {
        Basic.getLogger().info("Preparing Pepsi Coke meal...");
        return new Meal()
            .addItem(new Pepsi())
            .addItem(new Coke());
    }

}
