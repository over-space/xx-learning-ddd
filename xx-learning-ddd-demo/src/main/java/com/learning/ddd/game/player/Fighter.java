package com.learning.ddd.game.player;

/**
 * 玩家-战士
 */
public class Fighter extends Player {

    private String name;

    public Fighter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}