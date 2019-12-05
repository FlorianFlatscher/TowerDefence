package com.ehif.td.game.world.placeable.tower;

import com.ehif.td.Sketch;
import com.ehif.td.game.world.World;
import processing.core.PVector;

public class ArcherTower extends Tower {

    public ArcherTower(World w, PVector pos) {
        super(w, pos, 150, 10, 100, 500);
    }

    @Override
    public void update() {

    }

    @Override
    public void display(Sketch s) {
        s.strokeWeight(3);
        s.stroke(0);
        s.ellipse(getX(), getY(), 20, 20);
        s.fill(255, 0 ,0);
    }

    @Override
    public boolean alive() {
        return true;
    }

    @Override
    public boolean pointInRadius(PVector p) {
        return false;
    }
}

