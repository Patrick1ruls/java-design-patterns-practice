package com.pvermillion.design.pattern.abstractFactory.shape.factories;

import com.pvermillion.basic.Basic;
import com.pvermillion.design.pattern.abstractFactory.shape.ShapeType;
import com.pvermillion.design.pattern.abstractFactory.shape.objects.Rectangle;
import com.pvermillion.design.pattern.abstractFactory.shape.objects.Shape;
import com.pvermillion.design.pattern.abstractFactory.shape.objects.Square;

public class ShapeFactory implements Factory {
    @Override
    public Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case Square:
                return getSquare();
            case Rectangle:
                return getRectangle();
            default:
                Basic.getLogger().info("No shape specified, defaulting to square...");
                return getSquare();
        }
    }

    private Shape getSquare() {
        Basic.getLogger().info("Shape factory creating a new square...");
        return new Square();
    }

    private Shape getRectangle() {
        Basic.getLogger().info("Shape factory creating a new rectangle...");
        return new Rectangle();
    }
}
