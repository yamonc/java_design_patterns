package com.patterns.abstractFactory;

/**
 * @Created by Intellij IDEA.
 * @author: 陈亚萌
 * @Date: 2020/3/24
 */
public class YoungTeamFactory implements TeamFactory {
    public Ship createShip() {
        return new NewShip();
    }

    public Captain createCaptain() {
        return new YoungCaptain();
    }

    public Sailor createSailor() {
        return new YoungSailor();
    }
}
