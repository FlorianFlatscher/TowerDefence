package com.ehif.td.game.world.placeable;

import com.ehif.td.Sketch;
import com.ehif.td.game.world.World;
import processing.core.PVector;

public abstract class Placeable {
    private World w;
    private PVector pos;
    private Hitbox hitbox;
    public Placeable(World w, PVector pos, Hitbox h) {
        this.w = w;
        this.pos = pos;
        this.hitbox = h;
    }

    public World getW() {
        return w;
    }

    public void setW(World w) {
        this.w = w;
    }

    public abstract void update();

    public abstract void display(Sketch s);

    public abstract boolean alive();

    public abstract boolean pointInRadius(PVector p);

    public PVector getPlaceablePos() {
        return pos;
    }

    public void setPlaceablePos(PVector placeablePos) {
        this.pos = placeablePos;
    }



}
