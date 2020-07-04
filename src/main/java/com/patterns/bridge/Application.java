package com.patterns.bridge;

public class Application {
    public static void main(String[] args) {
        War war = new AncientWar(new IntrepidEnemy());
        war.startWar();
        war.combatting();
        war.stopWar();
        System.out.println("\n");

        War war2 = new AncientWar(new TenderEnemy());
        war2.startWar();
        war2.combatting();
        war2.stopWar();
        System.out.println("\n");

        War war3 = new MordernWar(new IntrepidEnemy());
        war3.startWar();
        war3.combatting();
        war3.stopWar();
        System.out.println("\n");


        War war4 = new MordernWar(new TenderEnemy());
        war4.startWar();
        war4.combatting();
        war4.stopWar();
        System.out.println("\n");

    }
}
