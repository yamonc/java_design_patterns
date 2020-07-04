package com.patterns.Singleton;
/**
 * “懒汉式” 的单例模式
 * <p>
 * 内部类在被引用之前不会被类加载器加载，直到客户端调用的时候才被加载
 * <p>
 * 这个方案是线程安全的
 */
public class LazyInitializationDirector {
    private LazyInitializationDirector(){

    }
    public static LazyInitializationDirector getInstance(){
        return InstanceHolder.INSTANCE;
    }

    /**
     * 延迟加载，生成{@link LazyInitializationDirector} 的实例
     */
    private static class InstanceHolder{
        private static final LazyInitializationDirector INSTANCE = new LazyInitializationDirector();
    }
}
