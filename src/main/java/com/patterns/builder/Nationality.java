package com.patterns.builder;

/**
 * 国籍
 * @Created by Intellij IDEA.
 * @author: 陈亚萌
 * @Date: 2020/3/9
 */
public enum Nationality {
    /**
     * 国籍信息
     */
    CHINA("中国"),
    RUSSIA("俄罗斯"),
    USA("美国"),
    JAPAN("日本"),
    UK("英国")
    ;
    private String name;

    Nationality(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
