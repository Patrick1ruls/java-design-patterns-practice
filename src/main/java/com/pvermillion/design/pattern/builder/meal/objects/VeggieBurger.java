package com.pvermillion.design.pattern.builder.meal.objects;

public class VeggieBurger extends Burger {

    @Override
    public String name() {
        return "Veggie Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }

}
