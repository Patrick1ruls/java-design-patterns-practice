package com.pvermillion.design.pattern.abstractFactory.ufo.factories;

import com.pvermillion.basic.Basic;

public class EnemyShipFactoryProducer extends EnemyShipFactory {

    private static EnemyShipFactory createEnemyShipFactory(EnemyShipFactoryType enemyShipFactoryType) {
        switch (enemyShipFactoryType) {
            case UFOFactory:
                return createUFOFactory();
            case BossUFOFactory:
                return createBossUFOFactory();
            default:
                Basic.getLogger().info("No ship factory type provided, defaulting to UFO factory...");
                return createUFOFactory();
        }
    }

    private static UFOFactory createUFOFactory() {
        Basic.getLogger().info("Enemy ship factory creating a new UFO factory...");
        return new UFOFactory();
    }

    private static BossUFOFactory createBossUFOFactory() {
        Basic.getLogger().info("Enemy ship factory creating a new Boss UFO factory...");
        return new BossUFOFactory();
    }
}
