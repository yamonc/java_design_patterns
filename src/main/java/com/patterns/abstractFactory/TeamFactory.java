package com.patterns.abstractFactory;

/**
 * @Created by Intellij IDEA.
 * @author: 陈亚萌
 * @Date: 2020/3/24
 */
public interface TeamFactory {
    Ship createShip();
    Captain createCaptain();
    Sailor createSailor();
}
