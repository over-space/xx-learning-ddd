package com.learning.ddd.game.monster;

import com.learning.ddd.game.player.Dragoon;
import com.learning.ddd.game.player.Player;
import com.learning.ddd.game.weapon.Weapon;

/**
 * 野怪-龙
 * @author lifang
 * @since 2022/2/14
 */
public class Dragon extends Monster {

    private String name;

    public Dragon(String name, Long health) {
        this.name = name;
        super.setHealth(health);
    }


    @Override
    public void receiveDamageBy(Weapon weapon, Player player) {
        if (player instanceof Dragoon) {
            this.setHealth(this.getHealth() - weapon.getDamage() * 2); // 龙骑伤害规则
        }
        // else no damage, 龙免疫力规则
    }
}