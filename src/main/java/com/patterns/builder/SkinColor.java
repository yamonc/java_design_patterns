package com.patterns.builder;

/**
 * @Created by Intellij IDEA.
 * @author: 陈亚萌
 * @Date: 2020/3/9
 */
public enum SkinColor {
    /**
     * 肤色
     */
    YELLOW("黄色"),
    BLACK("黑色"),
    WHITE("白色")
    ;

    private String color;

    SkinColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
