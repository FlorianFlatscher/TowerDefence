package com.ehif.td;

import com.ehif.td.game.Game;
import engine.Updateable;
import processing.core.PApplet;
import processing.core.PShape;
import ui.images.ImageLoader;
import ui.mouse.MouseEvent;
import ui.mouse.MouseListener;

import java.util.ArrayList;

public class Sketch extends PApplet {

    public static final int w = 1000;
    public static final int h = 600;
    public static final int InGameMenuHeight = 200;

    public static ArrayList<MouseListener> mouseListeners;

    public static Sketch s;

    private Game g;
    @Override
    public void settings() {

        size(w, h+InGameMenuHeight);
    }

    @Override
    public void setup() {
        s = this;
        ImageLoader.loadImages();
        mouseListeners = new ArrayList<>();
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



    //Event handling


    @Override
    public void mousePressed() {
        for (MouseListener l: mouseListeners) {
            l.mousePressed(new MouseEvent(this, mouseX, mouseY));
        }
    }

    @Override
    public void mouseClicked() {
        for (MouseListener l: mouseListeners) {
            l.mouseClicked(new MouseEvent(this, mouseX, mouseY));
        }
    }

    @Override
    public void mouseReleased() {
        for (MouseListener l: mouseListeners) {
            l.mouseReleased(new MouseEvent(this, mouseX, mouseY));
        }
    }
}
