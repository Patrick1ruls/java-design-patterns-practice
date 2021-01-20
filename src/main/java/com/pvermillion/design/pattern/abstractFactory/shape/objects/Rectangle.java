package com.pvermillion.design.pattern.abstractFactory.shape.objects;

import com.pvermillion.basic.Basic;

public class Rectangle implements Shape {
    @Override
    public void log() {
        Basic.getLogger().info("I'm a Rectangle!!");
    }
}
