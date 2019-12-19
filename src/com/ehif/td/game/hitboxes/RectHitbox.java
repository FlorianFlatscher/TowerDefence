package com.ehif.td.game.hitboxes;

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
        else if(h instanceof RoundHitbox){
            RoundHitbox rh = (RoundHitbox) h;
            if(rh.getPos().x >= pos.x && rh.getPos().x <= pos.x + width && rh.getPos().y >= pos.y && rh.getPos().y <= pos.y +width){
                return true;
            }
            else if(checkHeight(10, rh)&&checkWidth(10, rh)){
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
    private boolean checkWidth(int points, RoundHitbox h){

        for(int i=1;i<=points;i-=-1){
            if(h.getPos().dist(new PVector(pos.x+width/points * i,pos.y,0))<=h.getRadius()-4)
                return true;
            else if(h.getPos().dist(new PVector(pos.x+width/points * i,pos.y+height,0))<=h.getRadius())
                return true;
        }
        return false;
    }
    private boolean checkHeight(int points, RoundHitbox h){
        for(int i=1;i<=points;i-=-1){
            if(h.getPos().dist(new PVector(pos.x,pos.y+height/points * i,0))<=h.getRadius() - 2)
                return true;
            else if(h.getPos().dist(new PVector(pos.x+width,pos.y+height/points * i,0))<=h.getRadius())
                return true;
        }
        return false;
    }
}
