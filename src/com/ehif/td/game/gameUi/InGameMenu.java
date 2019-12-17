package com.ehif.td.game.gameUi;

import com.ehif.td.Sketch;
import ui.button.Button;

import java.util.ArrayList;

public class InGameMenu {

    private int relativeHeight;

    private ArrayList<Button> buttons = new ArrayList<Button>();


    public InGameMenu( int h) {
        this.relativeHeight = h;
    }

    public void add(Button b) {
        b.setY(b.getY()+relativeHeight);
        buttons.add(b);
    }

    public void display(Sketch s){
        s.fill(150);
        s.noStroke();
        s.rect(0, relativeHeight,s.width, s.height - relativeHeight);
        for (Button b : buttons) {
            b.display(s);
        }
    }

}
