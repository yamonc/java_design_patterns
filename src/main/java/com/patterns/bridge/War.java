package com.patterns.bridge;

/**
 * 战争接口
 */
public interface War {
    Enemy getEnemy();
    void startWar();
    void combatting();
    void stopWar();
}
