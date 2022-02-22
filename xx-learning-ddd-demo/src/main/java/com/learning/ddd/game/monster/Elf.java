package com.learning.ddd.game.monster;

import com.learning.ddd.game.player.Player;
import com.learning.ddd.game.weapon.Weapon;

/**
 * 野怪-精灵
 * @author lifang
 * @since 2022/2/14
 */
public class Elf extends Monster {

    private String name;

    public Elf(String name, Long health) {
        this.name = name;
        super.setHealth(health);
    }

    @Override
    public void receiveDamageBy(Weapon weapon, Player player) {
        if (weapon.getDamageType() != 0) {
            this.setHealth(this.getHealth() - weapon.getDamage() / 2); // Elf对魔法攻击伤害减半
        } else {
            super.receiveDamageBy(weapon, player);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
