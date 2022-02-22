package com.learning.ddd.game.player;

/**
 * 玩家-龙骑士
 */
public class Dragoon extends Player {

    private String name;

    public Dragoon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}