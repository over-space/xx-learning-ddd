package com.learning.ddd.game.monster;

import com.learning.ddd.game.player.Player;
import com.learning.ddd.game.weapon.Weapon;

/**
 * 野怪 抽象类
 */
public abstract class Monster {

    /**
     * 野怪血量
     */
    Long health;

    public void receiveDamageBy(Weapon weapon, Player player) {
        this.health -= weapon.getDamage(); // 基础规则
    }

    public Long getHealth() {
        return health;
    }

    public void setHealth(Long health) {
        this.health = health;
    }
}