package com.pvermillion.design.pattern.abstractFactory.item.factories;

import com.pvermillion.basic.Basic;
import com.pvermillion.design.pattern.builder.meal.objects.*;

import java.util.Random;

public class ItemFactory {

    private static final int UPPER_RANDOM_BOUND = 4;

    public Item getRandomItem() {
        return getItem(convertIntToItemType(generateRandomInt()));
    }

    public Item getItem(ItemType itemType) {
        switch (itemType) {
            case ChickenBurger:
                return getChickenBurger();
            case VeggieBurger:
                return getVeggieBurger();
            case Coke:
                return getCoke();
            case Pepsi:
                return getPepsi();
            default:
                Basic.getLogger().info("No item specified, defaulting to chicken burger...");
                return getChickenBurger();
        }
    }

    private Item getChickenBurger() {
        Basic.getLogger().info("Item factory creating new chicken burger...");
        return new ChickenBurger();
    }

    private Item getVeggieBurger() {
        Basic.getLogger().info("Item factory creating new veggie burger...");
        return new VeggieBurger();
    }

    private Item getCoke() {
        Basic.getLogger().info("Item factory creating new coke...");
        return new Coke();
    }

    private Item getPepsi() {
        Basic.getLogger().info("Item factory creating new pepsi...");
        return new Pepsi();
    }

    private ItemType convertIntToItemType(int number) {
            switch (number) {
                case 1:
                    return ItemType.VeggieBurger;
                case 2:
                    return ItemType.Coke;
                case 3:
                    return ItemType.Pepsi;
                default:
                    return ItemType.ChickenBurger;
            }
        }

    private int generateRandomInt() {
        return new Random().nextInt(UPPER_RANDOM_BOUND);
    }


}
