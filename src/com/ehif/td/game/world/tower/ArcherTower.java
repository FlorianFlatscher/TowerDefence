package com.ehif.td.game.world.tower;

import com.ehif.td.game.world.World;

public class ArcherTower extends Tower {

    public ArcherTower(World w, float x, float y, float radius, float fireSpeed, double damage, int cost) {
        super(w, x, y, radius, fireSpeed, damage, cost);
        radius = 150;
        fireSpeed = 10;
        damage = 100;
        cost = 500;
    }

}

