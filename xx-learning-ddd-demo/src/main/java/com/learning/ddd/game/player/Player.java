package com.learning.ddd.game.player;

import com.learning.ddd.game.monster.Monster;
import com.learning.ddd.game.weapon.Weapon;

/**
 * 玩家
 */
public abstract class Player {

    Weapon weapon;

    public void attack(Monster monster) {
        monster.receiveDamageBy(weapon, this);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}