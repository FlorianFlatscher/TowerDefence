package com.ehif.td.game.world.ui.button;

import com.ehif.td.Sketch;
import processing.core.PShape;

public class Button {
    private int x;
    private int y;
    private int width;
    private int height;
    private PShape p;
    public Button(int x, int y, int width, int height, PShape p){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.p = p;
    }
    public void display(Sketch s){
        s.shape(this.p, x, y, width, height);
    }
}
