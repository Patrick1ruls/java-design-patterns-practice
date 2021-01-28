package com.pvermillion.design.pattern.abstractFactory.ufo.objects;

import com.pvermillion.basic.Basic;

/**
 * Difference between an abstract class vs and interface
 * Abstract class: This object IS a thing.
 * Interface: This object DOES a thing.
 */

public abstract class EnemyShip {

    private String name;
    private EnemyShipWeapon weapon;
    private EnemyShipEngine engine;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnemyShipWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(EnemyShipWeapon weapon) {
        this.weapon = weapon;
    }

    public EnemyShipEngine getEngine() {
        return engine;
    }

    public void setEngine(EnemyShipEngine engine) {
        this.engine = engine;
    }

    public void logInfo() {
        Basic.getLogger().info("The " + this.name + " has a top speed of " +
            this.engine + " and and attack power of " + this.weapon);
    }
}
