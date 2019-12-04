package com.ehif.td;

import com.ehif.td.game.Game;
import processing.core.PApplet;

public class Sketch extends PApplet {

    public static final int w = 1000;
    public static final int h = 600;
    public static final int InGameMenuHeight = 200;

    private Game g;
    @Override
    public void settings() {
        size(w, h+UIheight);

    }

    @Override
    public void setup() {
        g = new Game(w, h);
    }

    @Override
    public void draw() {
        g.update();
        g.display(this);
    }

    public static void main (String[] args) {
        PApplet.main("com.ehif.td.Sketch");
    }
}
