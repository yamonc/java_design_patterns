package com.patterns.factoryMethod;

public class ChineseCook implements Cook {
    public Food cookFood(FoodType foodType) {
        return new ChineseFood(foodType);
    }
}
