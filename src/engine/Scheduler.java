package engine;

import engine.tasks.RepeatingTask;

import java.util.ArrayList;

public class Scheduler {
    private ArrayList<Updateable> tasks;

    public Scheduler() {
        tasks = new ArrayList<>();
    }

    public void update() {
        for (Updateable u: tasks) {
            u.update();
        }
    }

    public void addRepeatingTask(Updateable updateable, int ticks) {
        tasks.add(new RepeatingTask(updateable, ticks));
    }
}
