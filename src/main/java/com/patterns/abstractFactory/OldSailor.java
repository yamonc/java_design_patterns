package com.patterns.abstractFactory;

/**
 * @Created by Intellij IDEA.
 * @author: 陈亚萌
 * @Date: 2020/3/24
 */
public class OldSailor implements Sailor {

    static final String DESCRIPTION= "我是一名老水手";
    public String getDescription() {
        return DESCRIPTION;
    }
}
