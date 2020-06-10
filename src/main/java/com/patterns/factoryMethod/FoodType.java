package com.patterns.factoryMethod;

public enum FoodType {
    /**
     * 热的食物
     */
    HOT("热的"),
    /**
     * 凉的食物
     */
    COLD("冷的"),
    ;
    private String name;
    FoodType(String foodType){
        this.name = foodType;
    }

    public String getName() {
        return name;
    }
}
