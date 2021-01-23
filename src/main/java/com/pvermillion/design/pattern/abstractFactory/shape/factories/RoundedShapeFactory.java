package com.pvermillion.design.pattern.abstractFactory.shape.factories;

import com.pvermillion.basic.Basic;
import com.pvermillion.design.pattern.abstractFactory.shape.ShapeType;
import com.pvermillion.design.pattern.abstractFactory.shape.objects.*;
import com.pvermillion.design.pattern.abstractFactory.shape.objects.Shape;

public class RoundedShapeFactory implements Factory {
    @Override
    public Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case Square:
                return getRoundedSquare();
            case Rectangle:
                return getRoundedRectangle();
            default:
                Basic.getLogger().info("No shape specified, defaulting to rounded square...");
                return getRoundedSquare();
        }
    }

    private Shape getRoundedSquare() {
        Basic.getLogger().info("Rounded shape factory creating a new rounded square...");
        return new RoundedSquare();
    }

    private Shape getRoundedRectangle() {
        Basic.getLogger().info("Rounded shape factory creating a new rounded rectangle...");
        return new RoundedRectangle();
    }
}
