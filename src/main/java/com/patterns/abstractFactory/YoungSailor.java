package com.patterns.abstractFactory;

/**
 * @Created by Intellij IDEA.
 * @author: 陈亚萌
 * @Date: 2020/3/24
 */
public class YoungSailor implements Sailor {
    static final String DESCRIPTION = "我是年轻的水手";
    public String getDescription() {
        return DESCRIPTION;
    }
}
