package com.ehif.td.game.world.placeable;

import processing.core.PVector;

public class RectHitbox implements Hitbox {
    private PVector pos;
    private float width;
    private float height;


    public RectHitbox(PVector p, float width, float height) {
        this.pos = p;
        this.width = width;
        this.height = height;
    }
    @Override
    public boolean inRange(Hitbox h) {
        if (h instanceof RectHitbox) {
            RectHitbox rh = (RectHitbox) h;
            if (pos.x < rh.getPos().x + rh.getWidth() &&
                    pos.x + this.width > rh.getPos().x &&
                    pos.y < rh.getPos().y + rh.getHeight() &&
                    pos.y + this.height > rh.getPos().y) {
                return true;
            }
        }
        return false;

    }

    public PVector getPos() {
        return pos;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }
}
