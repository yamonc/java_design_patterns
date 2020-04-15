package com.patterns.abstractFactory;

/**
 * @Created by Intellij IDEA.
 * @author: 陈亚萌
 * @Date: 2020/3/24
 */
public class OldCaptain implements Captain {
    static final String DESCRIPTION= "我是一名老船长";
    public String getDescription() {
        return DESCRIPTION;
    }
}
