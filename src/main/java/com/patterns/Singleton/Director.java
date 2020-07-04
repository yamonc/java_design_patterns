package com.patterns.Singleton;

import java.nio.file.DirectoryStream;

/**
 * “饿汉式” 的单例实现方式
 * <p>
 * 可以保证线程安全
 */
public final class Director {
    /**
     * 静态的本质实例
     */
    private static final Director INSTANCE = new Director();

    /**
     * 私有化的构造方法保证不被其它类调用
     */
    private Director(){

    }

    /**
     * 客户端调取单例实例
     * @return 单例
     */
    public static Director getInstance(){
        return INSTANCE;
    }



}
