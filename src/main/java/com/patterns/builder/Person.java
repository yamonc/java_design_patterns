package com.patterns.builder;

import java.sql.PreparedStatement;

/**
 * 人
 * @Created by Intellij IDEA.
 * @author: 陈亚萌
 * @Date: 2020/3/9
 */
public final  class Person {
    private final String name;
    private final Integer age;
    private final Nationality nationality;
    private final SkinColor skinColor;

    public Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.nationality = builder.nationality;
        this.skinColor = builder.skinColor;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public SkinColor getSkinColor() {
        return skinColor;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        if (null != nationality) {
            sb.append(" 是来自 " + nationality.toString() + " 的");
        }
        if (null != age) {
            sb.append(" " + age + "岁的");
        }
        if (null != skinColor) {
            sb.append(" 有着" + skinColor + "皮肤的");
        }
        sb.append("一个人");
        return sb.toString();
    }
    public static class Builder{
        private String name;
        private Integer age;
        private Nationality nationality;
        private SkinColor skinColor;
        public Builder age(Integer age){
            this.age=age;
            return this;
        }
        public Builder name(String name) throws IllegalAccessException {
            if (null == name){
                throw new IllegalAccessException("人必须有名字");
            }
            this.name = name;
            return this;
        }
        public Builder nationality(Nationality nationality){
            this.nationality=nationality;
            return this;
        }
        public Builder skinColor(SkinColor skinColor) {
            this.skinColor = skinColor;
            return this;
        }
        public Person build() {
            return new Person(this);
        }
    }
}
