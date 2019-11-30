package com.ehif.td.game;

import com.ehif.td.Sketch;
import com.ehif.td.game.world.World;

public class Game {
    private World w;

    public Game(int width, int height) {
        w = new World(Sketch.w, Sketch.h, 100, 100);
    }

    public void display(Sketch s) {
        w.display(s, 0, 0);
    }

    public void update() {

    }
}
