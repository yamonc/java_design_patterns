package com.patterns.Singleton;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

public class Application {
    public static void main(String[] args) {
        Director director = Director.getInstance();
        Director director1 = Director.getInstance();
        System.out.println("饿汗式单例"+director);
        System.out.println("饿汗式单例1"+director1);
        LazyInitializationDirector lazyInitializationDirector = LazyInitializationDirector.getInstance();
        LazyInitializationDirector lazyInitializationDirector1 = LazyInitializationDirector.getInstance();
        System.out.println("懒汉式单例："+lazyInitializationDirector);
        System.out.println("懒汉式单例1："+lazyInitializationDirector1);
        // 双检锁
        ThreadSafeDoubleCheckLocking doubleCheckLocking1 = ThreadSafeDoubleCheckLocking.getInstance();
        System.out.println("双检锁单例1 "+doubleCheckLocking1);
        ThreadSafeDoubleCheckLocking doubleCheckLocking2 = ThreadSafeDoubleCheckLocking.getInstance();
        System.out.println("双检锁单例2 "+doubleCheckLocking2);
    }
}
