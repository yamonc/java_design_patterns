package com.patterns.builder;

import java.util.logging.Logger;

/**
 * @Created by Intellij IDEA.
 * @author: 陈亚萌
 * @Date: 2020/3/9
 */
public class Application {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Application.class));

    public static void main(String[] args) throws IllegalAccessException {
        Person personWang =
                new Person.Builder().name("小王").age(22).nationality(Nationality.CHINA).skinColor(SkinColor.YELLOW).build();
        Person personZhang =
                new Person.Builder().name("小张").age(24).nationality(Nationality.USA).skinColor(SkinColor.WHITE).build();
        Person personLiu =
                new Person.Builder().name("小六").age(32).nationality(Nationality.UK).skinColor(SkinColor.BLACK).build();
        LOGGER.info(personWang.toString());
        LOGGER.info(personZhang.toString());
        LOGGER.info(personLiu.toString());
    }
}
