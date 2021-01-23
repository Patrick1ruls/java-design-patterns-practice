package com.pvermillion.design.pattern.abstractFactory;

import com.pvermillion.basic.Basic;

/**
 * Abstract Factory is a very central design pattern for Dependency Injection (DI).
 * Similar to a factory but everything is encapsulated.
 * Can create families of related object without specifying a concrete class.
 *   This is because each of the objects share a common interface.
 */

public class AbstractFactoryApp {
    public static void main(String[] args) {
        Basic.getLogger().info("Hello World!");
    }
}
