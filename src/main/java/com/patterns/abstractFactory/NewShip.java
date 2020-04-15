package com.patterns.abstractFactory;

/**
 * @Created by Intellij IDEA.
 * @author: 陈亚萌
 * @Date: 2020/3/24
 */
public class NewShip implements Ship {
    static final String DESCRIPTION="我是一条崭新的船";
    public String getDescription() {
        return DESCRIPTION;
    }
}
