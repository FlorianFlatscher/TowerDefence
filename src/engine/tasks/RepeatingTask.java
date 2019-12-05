package engine.tasks;

import engine.Updateable;

public class RepeatingTask implements Updateable {
    private int ticks;
    private int count;

    private Updateable updateable;

    public RepeatingTask (Updateable updateable, int ticks) {
        this.ticks = ticks;
        this.count = ticks - 1;

        this.updateable = updateable;
    }

    @Override
    public void update() {
        count--;
        if (count <= 0) {
            updateable.update();
            count = ticks-1;
        }
    }
}

