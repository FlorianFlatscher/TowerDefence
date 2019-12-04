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
        s.shape(this.p, x, y, width, height);
    }
    public void display2(Sketch s){s.rect(x,y,width,height);}
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
