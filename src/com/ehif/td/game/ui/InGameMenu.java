package com.ehif.td.game.ui;

import com.ehif.td.Sketch;
import com.ehif.td.game.ui.button.Button;

import java.util.ArrayList;

public class InGameMenu {
    private int offset;
    private ArrayList<Button> buttons = new ArrayList<Button>();

    public InGameMenu(int offset) {
        this.offset = offset;
    }

    public InGameMenu() {
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
