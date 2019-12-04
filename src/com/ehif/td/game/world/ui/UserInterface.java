package com.ehif.td.game.world.ui;

import com.ehif.td.Sketch;

import java.util.ArrayList;

public class UserInterface {
    private int offset;
    private ArrayList<Button> buttons = new ArrayList<Button>();

    public UserInterface(int offset) {
        this.offset = offset;
    }

    public UserInterface() {
        this.offset = 0;
    }

    public void add(Button b) {
        buttons.add(b);
    }

    public void display(Sketch s) throws NullPointerException {
        try {
            for (Button b : buttons) {
                b.display(s);
            }
        } catch (NullPointerException e) {
            System.out.println("NullPointerException in UserInterface @ line 22");
        }
    }

}
