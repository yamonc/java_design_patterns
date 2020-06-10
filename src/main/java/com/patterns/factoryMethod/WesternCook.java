package com.patterns.factoryMethod;

public class WesternCook implements Cook{
    public Food cookFood(FoodType foodType) {
        return new WesternFood(foodType);
    }
}
