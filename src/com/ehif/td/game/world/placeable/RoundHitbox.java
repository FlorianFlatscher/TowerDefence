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
        else if(h instanceof  RectHitbox) {
            RectHitbox rh = (RectHitbox) h;
            if((pos.x > rh.getPos().x&&pos.x <= rh.getPos().x + rh.getWidth())&&(pos.y > rh.getPos().y&&pos.y < rh.getPos().y+rh.getHeight())){
                return true;
            }
            else if(checkWidth(5, rh)||checkHeight(5, rh))
                return true;
        }
        return false;
    }
    private boolean checkWidth(int points, RectHitbox h){
        for(int i=1;i<=points;i-=-1){
            if(pos.dist(new PVector(h.getPos().x/i,h.getPos().y,0))<=radius)
                return true;
            else if(pos.dist(new PVector(h.getPos().x/i,h.getPos().y+h.getHeight(),0))<=radius)
                return true;
        }
        return false;
    }
    private boolean checkHeight(int points, RectHitbox h){
        for(int i=1;i<=points;i-=-1){
            if(pos.dist(new PVector(h.getPos().x,h.getPos().y/i,0))<=radius)
                return true;
            else if(pos.dist(new PVector(h.getPos().x+h.getWidth(),h.getPos().y/i,0))<=radius)
                return true;
        }
        return false;
    }

}
