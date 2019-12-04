package com.ehif.td.game.world.tower;

import com.ehif.td.Sketch;
import com.ehif.td.game.world.World;

public abstract class Tower {

    private World w;
    private float x;
    private float y;
    private float radius;
    private float fireSpeed;
    private double damage;
    private int cost;

    public Tower(World w, float x, float y, float radius, float fireSpeed, double damage, int cost) {
        this.w = w;
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.fireSpeed = fireSpeed; // fireSpeed = ticks/100  (= 1sec => fireSpeed 10)
        this.damage = damage;
        this.cost = cost;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public World getW() {
        return w;
    }

    public void setW(World w) {
        this.w = w;
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
    public void update(Sketch s){

    }
    public void display(Sketch s){

    }
}
