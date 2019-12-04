package com.ehif.td.game;

import com.ehif.td.Sketch;
import com.ehif.td.game.ui.InGameMenu;
import com.ehif.td.game.ui.button.Button;
import com.ehif.td.game.world.World;
import processing.core.PShape;



public class Game {
    private World w;
    private InGameMenu menu;
    public Game(int width, int height) {
        w = new World(Sketch.w, Sketch.h, Sketch.w/15, Sketch.h/8);
        menu = new InGameMenu(Sketch.h);

        menu.add(new Button(50, 50, 100, 50, new PShape()));
    }

    public void display(Sketch s) {
        w.display(s, 0, 0);
        menu.display(s);
    }

    public void update() {

    }
}
