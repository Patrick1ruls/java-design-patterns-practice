package com.pvermillion.design.pattern.abstractFactory.shape.factories;

import com.pvermillion.design.pattern.abstractFactory.shape.ShapeType;
import com.pvermillion.design.pattern.abstractFactory.shape.objects.Shape;

public interface Factory {
    Shape getShape(ShapeType shapeType);
}
