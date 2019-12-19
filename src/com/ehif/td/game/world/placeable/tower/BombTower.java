package com.ehif.td.game.world.placeable.tower;

import com.ehif.td.Sketch;
import com.ehif.td.game.world.World;
import com.ehif.td.game.world.placeable.RectHitbox;
import com.ehif.td.game.world.placeable.RoundHitbox;
import processing.core.PVector;

public class BombTower extends Tower {

    public BombTower(World w, PVector pos){
        super(w, pos, 20, 150, 10, 100, new RoundHitbox(pos, 7.5));
    }

    public void display(Sketch s){
        s.fill(0,0,255);
        s.ellipse(pos.x, pos.y, 15, 15);
    }

    @Override
    public boolean alive() {
        return false;
    }

    @Override
    public boolean pointInRadius(PVector p) {
        return false;
    }

    public void update(){

    }
}
