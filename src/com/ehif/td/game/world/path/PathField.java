package com.ehif.td.game.world.path;

import com.ehif.td.Sketch;

public class PathField {
    private int x;
    private int y;
    private int width;
    private int height;
    private PathField  next;
    private int xInWorld, yInWorld;

    public int getxInWorld() {
        return xInWorld;
    }

    public int getyInWorld() {


        return yInWorld;
    }

    public PathField(int x, int y, int width, int height, int xInWorld, int yInWorld) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.xInWorld = xInWorld;
        this.yInWorld = yInWorld;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void display(Sketch s, int x, int y, int b) {
        s.noStroke();
        s.fill(255, 0, 0, b);
        s.rect(x + this.x, y + this.y, width, height);
    }

    public void display(Sketch s, int x, int y) {
        display(s, x, y, 255);
    }
}
