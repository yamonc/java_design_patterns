package com.patterns.bridge;

/**
 * 强者
 */
public class IntrepidEnemy implements Enemy{
    public void onStartWar() {
        System.out.println("敌人信心满满，准备迎战。");
    }

    public void onCombatting() {
        System.out.println("敌人正在积极反抗。。。");
    }

    public void onStopWar() {
        System.out.println("双方打成了平手。。。");
    }
}
