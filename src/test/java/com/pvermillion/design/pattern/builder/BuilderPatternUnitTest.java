package com.pvermillion.design.pattern.builder;

import com.pvermillion.basic.Basic;
import com.pvermillion.design.pattern.abstractFactory.item.factories.ItemFactory;
import com.pvermillion.design.pattern.builder.meal.objects.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.List;

import static org.testng.Assert.*;

public class BuilderPatternUnitTest {

    @Test
    void getCostOfMealWithNoItems() {
        Meal emptyMeal = new Meal();
        emptyMeal.logItems();
        Basic.getLogger().info(() -> "" + emptyMeal.getCost());
    }

    @Test
    void howMuchIsAVeggieAndChickenBurger() {
        Meal meal = new MealBuilder()
            .prepareVeggieChickenBurgerMeal()
            .logItems();
        assertEquals(meal.getCost(), getItemTotal(meal.getItems()));
    }

    private float getItemTotal(List<Item> items) {
        float total = 0.0f;
        for(Item item : items) {
            total += item.price();
        }
        return total;
    }

    @Test
    void howMuchIs100ChickenBurgers() {
        Meal meal = new MealBuilder().prepare100VeggieBurgerMeal();
        Basic.getLogger().info(() -> "" + meal.getCost());
        assertEquals(meal.getCost(), getItemTotal(meal.getItems()));
    }

    @Test
    void howMuchIsAPepsiAndCoke() {
        Meal meal = new MealBuilder().preparePepsiCokeMeal();
        Basic.getLogger().info(() -> "" + meal.getCost());
        assertEquals(meal.getCost(), getItemTotal(meal.getItems()));
    }

    @Test(dataProvider = "allColdDrinks")
    void checkAllColdDrinksArePackagedInABottle(ColdDrink coldDrink) {
        Basic.getLogger().info(() -> "Cold drink: " + coldDrink.name() + " is packaged in a: " + coldDrink.getPackaging().getName());
        assertEquals(coldDrink.getPackaging().getName(), "Bottle");
    }

    @DataProvider(name = "allColdDrinks")
    private static Object[] coldDrinks() {
        return new Object[][] {
            {new Coke()},
            {new Pepsi()}
        };
    }

    @Test
    void giveMeAMealWith10RandomItems() {
        Meal meal = new Meal();
        ItemFactory itemFactory = new ItemFactory();
        for (int i = 0; i < 10; i++) {
            Item randomItem = itemFactory.getRandomItem();
            meal.addItem(randomItem);
        }
        meal.logItems();
        assertEquals(meal.getCost(), getItemTotal(meal.getItems()));
    }

}
