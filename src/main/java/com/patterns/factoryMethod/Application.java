package com.patterns.factoryMethod;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

public class Application {
    private Cook cook;
    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
    private Application(Cook cook){
        this.cook = cook;
    }

    public static void main(String[] args) {
        Application app = new Application(new WesternCook());
        app.makeFood();
        app = new Application(new ChineseCook());
        app.makeFood();
    }
    private void makeFood(){
        Food food;
        food = cook.cookFood(FoodType.COLD);
        System.out.println(food.toString());
        food = cook.cookFood(FoodType.HOT);
        System.out.println(food.toString());

    }
}
