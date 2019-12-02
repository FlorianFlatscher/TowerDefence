package com.ehif.td.game.world;

import com.ehif.td.Sketch;
import com.ehif.td.game.world.path.PathField;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class World {
    private ArrayList<PathField> path;
    private int width, height;

    public World(int width, int height, int widthCell, int heightCell) {

        generatePath(width / widthCell, height / heightCell, widthCell, heightCell);
        this.width = width;
        this.height = height;
    }

    private void generatePath(int width, int height, int widthCell, int heightCell) {
        width = width/2;
        height = height/2;

        Random rand = new Random();
        path = new ArrayList<>();
        boolean[][] field = new boolean[width][height];

        int[] current = new int[]{0, height/2};
        field[current[0]][current[1]] = true;
        int[] target = new int[]{width - 1, height/2};
        path.add(new PathField(current[0] * widthCell, current[1] * heightCell, widthCell, heightCell));

        while(current[0] != target[0] || current[1] != target[1]) {
            ArrayList<int[]> candidates =  new ArrayList<>();
            for (int x = -1; x <= 1; x+=2) {
                if (current[0] + x >= 0 && current[0] + x < width && !field[current[0] + x][current[1]]) {
                    candidates.add(new int[]{current[0] + x, current[1]});
                }
            }
            for (int y = -1; y <= 1; y+=2) {
                if (current[1] + y >= 0 && current[1] + y < height && !field[current[0]][current[1] + y]) {
                    candidates.add(new int[]{current[0], current[1] + y});
                }
            }

            if (candidates.size() > 0) {
                int[] next = candidates.get(rand.nextInt(candidates.size()));
                current = next;
                if (!field[current[0]][current[1]]) {
                    path.add(new PathField(current[0] * widthCell, current[1] * heightCell, widthCell, heightCell));
                    path.add(new PathField(current[0] * widthCell * 2, current[1] * heightCell * 2, widthCell, heightCell));
                }
                field[current[0]][current[1]] = true;
            }
            else if (path.size() > 0){
                path.remove(path.size() - 1);
                path.remove(path.size() - 1);
                current = new int[]{path.get(path.size() - 1).getX() / widthCell, path.get(path.size() - 1).getY() / heightCell};
            }
        }
        System.out.println(path.size());

    }

    public void display(Sketch s, int x, int y) {
        s.strokeWeight(3);
        s.stroke(0);
        s.fill(255);
        s.rect(x, y, width, height);
        for (int i = 0; i < path.size(); i++) {
            path.get(i).display(s, x, y, (int) s.map(i, 0, path.size(), 50, 255));
        }
    }
}
