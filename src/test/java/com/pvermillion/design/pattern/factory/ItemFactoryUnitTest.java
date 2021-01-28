package com.pvermillion.design.pattern.factory;

import com.pvermillion.design.pattern.abstractFactory.item.factories.ItemFactory;
import com.pvermillion.design.pattern.builder.meal.objects.Item;
import com.pvermillion.design.pattern.builder.meal.objects.ItemType;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertSame;

public class ItemFactoryUnitTest {

    @Test(dataProvider = "testItemFactoryObjects")
    public void createCorrectItemsFromFactory(ItemType itemType, String itemClassName) {
        ItemFactory itemFactory = new ItemFactory();
        Item item = itemFactory.getItem(itemType);
        assertSame(item.getClass().getName(), itemClassName);
    }

    @DataProvider(name = "testItemFactoryObjects")
    public static java.lang.Object[][] ItemClasses() {
        return new java.lang.Object[][] {
            {ItemType.Coke, "com.pvermillion.design.pattern.builder.meal.objects.Coke"},
            {ItemType.Pepsi, "com.pvermillion.design.pattern.builder.meal.objects.Pepsi"},
            {ItemType.ChickenBurger, "com.pvermillion.design.pattern.builder.meal.objects.ChickenBurger"},
            {ItemType.VeggieBurger, "com.pvermillion.design.pattern.builder.meal.objects.VeggieBurger"}
        };
    }

}
