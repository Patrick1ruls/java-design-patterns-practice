package com.pvermillion.design.pattern.builder.meal.objects;

public abstract class Burger implements Item{

    @Override
    public Packaging getPackaging() {
        return new Wrapper();
    }

}
