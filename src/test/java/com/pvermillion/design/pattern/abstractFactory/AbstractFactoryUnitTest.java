package com.pvermillion.design.pattern.abstractFactory;

import com.pvermillion.design.pattern.abstractFactory.item.factories.ItemFactory;
import com.pvermillion.design.pattern.abstractFactory.shape.ShapeType;
import com.pvermillion.design.pattern.abstractFactory.shape.factories.Factory;
import com.pvermillion.design.pattern.abstractFactory.shape.factories.FactoryProducer;
import com.pvermillion.design.pattern.abstractFactory.shape.factories.FactoryType;
import com.pvermillion.design.pattern.abstractFactory.shape.objects.Shape;
import com.pvermillion.design.pattern.builder.meal.objects.Item;
import com.pvermillion.design.pattern.builder.meal.objects.ItemType;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.pvermillion.design.pattern.abstractFactory.shape.ShapeType.*;
import static com.pvermillion.design.pattern.abstractFactory.shape.factories.FactoryType.*;
import static org.testng.Assert.*;

public class AbstractFactoryUnitTest {

    @Test(dataProvider = "testFactoryClasses")
    public void createCorrectShapeFactories(FactoryType factoryType, String className) {
        Factory ShapeFactory = FactoryProducer.createFactory(factoryType);
        assertSame(ShapeFactory.getClass().getName(), className);
    }

    @DataProvider(name = "testFactoryClasses")
    public static Object[][] FactoryClasses() {
        return new Object[][] {
            {ShapeFactory, "com.pvermillion.design.pattern.abstractFactory.shape.factories.ShapeFactory"},
            {RoundedShapeFactory, "com.pvermillion.design.pattern.abstractFactory.shape.factories.RoundedShapeFactory"}
        };
    }

    @Test(dataProvider = "testFactoryProducedShapeClasses")
    public void createCorrectShapesFromFactories(FactoryType factoryType, ShapeType shapeType, String className) {
        Factory Factory = FactoryProducer.createFactory(factoryType);
        Shape shape = Factory.getShape(shapeType);
        assertSame(shape.getClass().getName(), className);
    }

    @DataProvider(name = "testFactoryProducedShapeClasses")
    public static Object[][] FactoryShapeClasses() {
        return new Object[][] {
            {ShapeFactory, Square, "com.pvermillion.design.pattern.abstractFactory.shape.objects.Square"},
            {ShapeFactory, Rectangle, "com.pvermillion.design.pattern.abstractFactory.shape.objects.Rectangle"},
            {RoundedShapeFactory, Square, "com.pvermillion.design.pattern.abstractFactory.shape.objects.RoundedSquare"},
            {RoundedShapeFactory, Rectangle, "com.pvermillion.design.pattern.abstractFactory.shape.objects.RoundedRectangle"}
        };
    }

    @Test(dataProvider = "testItemFactoryObjects")
    public void createCorrectItemsFromFactory(ItemType itemType, String itemClassName) {
        ItemFactory itemFactory = new ItemFactory();
        Item item = itemFactory.getItem(itemType);
        assertSame(item.getClass().getName(), itemClassName);
    }

    @DataProvider(name = "testItemFactoryObjects")
    public static Object[][] ItemClasses() {
        return new Object[][] {
            {ItemType.Coke, "com.pvermillion.design.pattern.builder.meal.objects.Coke"},
            {ItemType.Pepsi, "com.pvermillion.design.pattern.builder.meal.objects.Pepsi"},
            {ItemType.ChickenBurger, "com.pvermillion.design.pattern.builder.meal.objects.ChickenBurger"},
            {ItemType.VeggieBurger, "com.pvermillion.design.pattern.builder.meal.objects.VeggieBurger"}
        };
    }



}
