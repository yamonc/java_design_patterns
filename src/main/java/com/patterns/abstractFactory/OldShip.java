package com.patterns.abstractFactory;

/**
 * @Created by Intellij IDEA.
 * @author: 陈亚萌
 * @Date: 2020/3/24
 */
public class OldShip implements Ship {

    static final String DESCRIPTION="我是一条破旧的船";
    public String getDescription() {
        return DESCRIPTION;
    }
}
