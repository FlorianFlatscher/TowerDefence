package com.ehif.td.game;

import com.ehif.td.Sketch;
import com.ehif.td.game.gameUi.InGameMenu;
import ui.button.Button;
import com.ehif.td.game.world.World;
import processing.core.PImage;
import processing.core.PShape;
import ui.images.ImageLoader;

import javax.swing.*;
import java.awt.image.ImageFilter;


public class Game {
    private World w;
    private InGameMenu menu;
    public Game(int width, int height) {
        w = new World(Sketch.w, Sketch.h, Sketch.w/20, Sketch.h/12);
        menu = new InGameMenu(Sketch.h);

        menu.add(new Button(50, 50, 100, 50, new PShape(ImageLoader.data.get("pause.svg"))));
    }

    public void display(Sketch s) {
        w.display(s, 0, 0);
        menu.display(s);
    }

    public void update() {

    }
}
