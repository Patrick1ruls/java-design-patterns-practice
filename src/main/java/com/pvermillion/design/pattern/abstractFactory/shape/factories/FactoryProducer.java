package com.pvermillion.design.pattern.abstractFactory.shape.factories;

import com.pvermillion.basic.Basic;

public class FactoryProducer {
    public static Factory createFactory(FactoryType factoryType) {
        switch (factoryType) {
            case ShapeFactory:
                return getShapeFactory();
            case RoundedShapeFactory:
                return getRoundedShapeFactory();
            default:
                Basic.getLogger().info("No factory type provided, defaulting to shape factory...");
                return getShapeFactory();
        }
    }

    private static Factory getShapeFactory() {
        Basic.getLogger().info("Factory producer creating new shape factory...");
        return new ShapeFactory();
    }

    private static Factory getRoundedShapeFactory() {
        Basic.getLogger().info("Factory producer creating new rounded shape factory...");
        return new RoundedShapeFactory();
    }
}
