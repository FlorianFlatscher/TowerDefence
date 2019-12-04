package com.ehif.td.game.world.placeable;

import com.ehif.td.game.world.World;
import processing.core.PVector;

public abstract class Placeable {
    private World w;

    public Placeable(World w) {
        this.w = w;
    }

    public World getW() {
        return w;
    }

    public void setW(World w) {
        this.w = w;
    }

    public abstract void update();

    public abstract void display();

    public abstract boolean alive();

    public abstract boolean pointInRadius(PVector p);
}
