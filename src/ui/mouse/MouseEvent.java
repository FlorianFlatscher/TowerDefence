package ui.mouse;

import com.ehif.td.Sketch;

public class MouseEvent {
    private float mouseX;
    private float mouseY;
    private Sketch s;

    public MouseEvent (Sketch s, float mouseX, float mouseY) {
        this.mouseX = mouseX;
        this.mouseY = mouseY;
    }

    public float getMouseX() {
        return mouseX;
    }

    public float getMouseY() {
        return mouseY;
    }

    public Sketch getS() {
        return s;
    }
}
