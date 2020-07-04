package com.patterns.bridge;

public class MordernWar implements War {
    private final Enemy enemy;

    public MordernWar(Enemy enemy) {
        this.enemy = enemy;
    }

    public Enemy getEnemy() {
        return this.enemy;
    }

    public void startWar() {
        System.out.println("一场现代战争要开始了...");
        enemy.onStartWar();
    }

    public void combatting() {
        System.out.println("现代战争正在激烈进行中...");
        enemy.onCombatting();
    }

    public void stopWar() {
        System.out.println("这场现代战争结束了...");
        enemy.onStopWar();
    }
}
