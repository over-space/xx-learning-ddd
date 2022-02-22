package com.learning.ddd.game.weapon;

/**
 * 武器
 */
public abstract class Weapon {

    /**
     * 伤害
     */
    private int damage;

    /**
     * 伤害类型
     * 0 - 物理攻击
     * 1 - 火攻击
     * 2 - 冰攻击
     */
    private int damageType;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamageType() {
        return damageType;
    }

    public void setDamageType(int damageType) {
        this.damageType = damageType;
    }
}