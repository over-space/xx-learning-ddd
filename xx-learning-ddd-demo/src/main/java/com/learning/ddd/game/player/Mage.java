package com.learning.ddd.game.player;

/**
 * 玩家-法师
 */
public class Mage extends Player {

    private String name;

    public Mage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}