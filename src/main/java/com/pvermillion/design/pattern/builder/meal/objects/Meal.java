package com.pvermillion.design.pattern.builder.meal.objects;

import com.pvermillion.basic.Basic;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Item> items = new ArrayList<>();
    private Item itemInstance;

    public List<Item> getItems() {
        return items;
    }

    public Meal addItem(Item item) {
        Basic.getLogger().info(() -> "Adding item: " + item.getClass().getSimpleName() + " to meal...");
        items.add(item);
        return this;
    }

    public Meal logItems() {
        for(Item item : items) {
            this.itemInstance = item;
            Basic.getLogger().info(() -> "" + createLogMessage());
        }
        return this;
    }

    private String createLogMessage() {
        return "Item: " + itemInstance.name() +
            ", Packing; " + itemInstance.getPackaging().getName() +
            ", Price: " + itemInstance.price();
    }


    public void logCost() {
        Basic.getLogger().info("Total cost of meal is " + getCost());
    }

    public float getCost() {
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

}
