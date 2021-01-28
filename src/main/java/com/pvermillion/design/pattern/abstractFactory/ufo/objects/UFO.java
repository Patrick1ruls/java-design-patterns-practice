package com.pvermillion.design.pattern.abstractFactory.ufo.objects;

import com.pvermillion.basic.Basic;
import com.pvermillion.design.pattern.abstractFactory.ufo.factories.EnemyShipFactory;

public class UFO extends EnemyShip {

    private EnemyShipFactory enemyShipFactory;

    public UFO(EnemyShipFactory shipFactory) {
        this.enemyShipFactory = shipFactory;
    }

}
