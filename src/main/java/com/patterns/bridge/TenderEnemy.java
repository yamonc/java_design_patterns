package com.patterns.bridge;

/**
 * 不堪一击的敌人
 */
public class TenderEnemy implements Enemy{

    public void onStartWar() {
        System.out.println("敌人士气不足，无奈迎战");
    }

    public void onCombatting() {
        System.out.println("敌人纷纷溃散");
    }

    public void onStopWar() {
        System.out.println("敌人不堪一击，只得头像");
    }
}
