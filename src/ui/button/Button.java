package ui.button;

import com.ehif.td.Sketch;
import processing.core.PShape;
import ui.mouse.MouseEvent;
import ui.mouse.MouseListener;

public class Button {
    private int x;
    private int y;
    private int width;
    private int height;
    private PShape p;
    ButtonListener listener;

    public Button(int x, int y, int width, int height, PShape p){
        Sketch.mouseListeners.add(new MouseListener() {
            @Override
            public void mousePressed(MouseEvent e) {
                if(inBounds(e.getMouseX(), e.getMouseY()))
                 System.out.println("mousePressed");
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                if(inBounds(e.getMouseX(), e.getMouseY()))
                    System.out.println("mouseClicked");

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if(inBounds(e.getMouseX(), e.getMouseY()))
                System.out.println("mouseReleased");


            }
        });
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.p = p;
    }

    public void display(Sketch s){
        s.pushMatrix();
        s.translate(x + width/2, y + height/2);
        s.rectMode(s.CENTER);
        s.stroke(0);
        s.strokeWeight(2);
        if (inBounds(s.mouseX, s.mouseY)) {
            s.fill(50, 50, 255);
            if (s.mousePressed) {
                s.scale(0.9f);
            }
        } else {
            s.fill(0, 0, 255);
        }
        s.rect(0, 0,width,height);
        s.shape(this.p, 0, 0, width, height);
        s.rectMode(s.CORNER);
        s.popMatrix();
    }
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    private boolean inBounds(float x, float y){
        if((x >= this.x && x <= this.x + this.width)&&(y >= this.y && y <= this.y +this.width))
            return true;
        return false;
    }
    public void addEventListener(ButtonListener listener) {
        this.listener = listener;
    }
}
