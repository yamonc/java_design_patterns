package com.patterns.factoryMethod;

public class ChineseFood implements Food {
    private FoodType foodType;

    public ChineseFood(FoodType foodType){
        this.foodType = foodType;
    }
    @Override
    public String toString() {
        return foodType.getName() + "中餐";
    }

    public FoodType getFoodType() {
        return foodType;
    }
}
