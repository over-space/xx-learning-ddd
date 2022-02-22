package com.learning.ddd.game.weapon;

/**
 * 武器-剑
 * @author lifang
 * @since 2022/2/14
 */
public class Sword extends Weapon{

    private String name;

    public Sword(String name, int damage) {
        this.name = name;
        super.setDamage(damage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
