package com.ehif.td.game.world.placeable.tower;

import com.ehif.td.Sketch;
import com.ehif.td.game.world.World;
import com.ehif.td.game.world.placeable.Hitbox;
import com.ehif.td.game.world.placeable.Placeable;
import processing.core.PVector;

public abstract class Tower extends Placeable {

    public PVector pos;

    private float range;
    private float fireSpeed;
    private double damage;
    private int cost;

    public Tower(World w, PVector pos, float range, float fireSpeed, double damage, int cost, Hitbox h) {
        super(w, pos, h);
        this.pos = pos;
        this.range = range;
        this.fireSpeed = fireSpeed; // fireSpeed = ticks/100  (= 1sec => fireSpeed 10)
        this.damage = damage;
        this.cost = cost;
    }

    public PVector getPos() {
        return pos;
    }

    public void setPos(PVector pos) {
        this.pos = pos;
    }

    public float getX() {
        return pos.x;
    }

    public void setX(float x) {
        this.pos.x = x;
    }

    public float getY() {
        return pos.y;
    }

    public void setY(float y) {
        this.pos.y = y;
    }

    public float getRange() {
        return range;
    }

    public void setRange(float range) {
        this.range = range;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public float getFireSpeed() {
        return fireSpeed;
    }

    public void setFireSpeed(float fireSpeed) {
        this.fireSpeed = fireSpeed;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }
    public abstract void display(Sketch s);
}
