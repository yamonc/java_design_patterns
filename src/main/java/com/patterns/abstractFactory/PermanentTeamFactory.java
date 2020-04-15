package com.patterns.abstractFactory;

/**
 * @Created by Intellij IDEA.
 * @author: 陈亚萌
 * @Date: 2020/3/24
 */
public class PermanentTeamFactory implements TeamFactory {

    public Ship createShip() {
        return new OldShip();
    }

    public Captain createCaptain() {
        return new OldCaptain();
    }

    public Sailor createSailor() {
        return new OldSailor();
    }
}
