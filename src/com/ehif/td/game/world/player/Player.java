package com.ehif.td.game.world.player;

public class Player {
    private int money = 500;
    private int enemiesDefeated = 0;
    private int score = 0;
    private String currentTower;
    public int getMoney() {
        return money;
    }

    public int getEnemiesDefeated() {
        return enemiesDefeated;
    }

    public int getScore() {
        return score;
    }
    public String getCurrentTower(){
        return currentTower;
    }

}
