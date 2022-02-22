package com.learning.ddd.game;

import com.learning.ddd.game.monster.Dragon;
import com.learning.ddd.game.player.Dragoon;
import com.learning.ddd.game.player.Fighter;
import com.learning.ddd.game.player.Player;
import com.learning.ddd.game.weapon.Sword;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author lifang
 * @since 2022/2/14
 */
public class GameTest {

    @Test
    public void testDragonImmunity() {
        // 玩家-战士
        Player player = new Fighter("Hero");

        // 武器-剑
        player.setWeapon(new Sword("Excalibur", 10));

        // 野怪-龙
        Dragon dragon = new Dragon("Dragon", 100L);

        // 攻击
        player.attack(dragon);

        // 野怪-龙对玩家-战士伤害免疫
        Assertions.assertEquals(dragon.getHealth(), 100L);
    }

    @Test
    public void testDragoonAttack() {
        // 玩家-骑士
        Player player = new Dragoon("Hero");

        // 武器-剑
        player.setWeapon(new Sword("Excalibur", 10));

        // 野怪-龙
        Dragon dragon = new Dragon("Dragon", 100L);

        // 攻击
        player.attack(dragon);

        // 玩家-战士对野怪-龙伤害翻倍
        Assertions.assertEquals(dragon.getHealth(), 80);
    }
}
