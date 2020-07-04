package com.patterns.bridge;

public class AncientWar implements War {
    private final Enemy enemy;

    public AncientWar(Enemy enemy) {
        this.enemy = enemy;
    }

    public Enemy getEnemy() {
        return this.enemy;
    }

    public void startWar() {
        System.out.println("一场古代战争开始了...");
        enemy.onStartWar();
    }

    public void combatting() {
        System.out.println("古代战争正在激烈进行中。。。");
        enemy.onCombatting();
    }

    public void stopWar() {
        System.out.println("古代战争已经结束了");
        enemy.onStopWar();
    }
}
