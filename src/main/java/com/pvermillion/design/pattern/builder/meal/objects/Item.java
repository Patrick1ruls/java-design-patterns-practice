package com.pvermillion.design.pattern.builder.meal.objects;

public interface Item {

    public String name();
    public Packaging getPackaging();
    public float price();

}

