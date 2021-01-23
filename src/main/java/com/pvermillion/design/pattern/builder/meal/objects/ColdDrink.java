package com.pvermillion.design.pattern.builder.meal.objects;

public abstract class ColdDrink implements Item {

    @Override
    public Packaging getPackaging() {
        return new Bottle();
    }

}
