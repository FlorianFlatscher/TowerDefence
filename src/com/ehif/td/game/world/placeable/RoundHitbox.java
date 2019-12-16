package com.ehif.td.game.world.placeable;

import processing.core.PVector;

public class RoundHitbox implements Hitbox {
    private PVector pos;
    private double radius;
    public RoundHitbox(PVector p, double r){
        this.pos = p;
        this.radius = r;
    }
    public PVector getPos(){
        return pos;
    }
    public boolean inRange(Hitbox h){
        if(h instanceof RoundHitbox){
            RoundHitbox rh = (RoundHitbox) h;
            if((pos.dist(rh.getPos()))<=this.radius+rh.radius)
                return true;
        }
        return false;

    }
}
