package com.languoxing.design_patterns.singleton_pattern.eager;

/*
 *类加载的方式是按需加载，且只加载一次。
 *因此，在上述单例类被加载时，就会实例化一个对象并交给自己的引用，供系统使用。
 *换句话说，在线程访问单例对象之前就已经创建好了。
 *再加上，由于一个类在整个生命周期中只会被加载一次，因此该单例类只会创建一个实例，
 *也就是说，线程每次都只能也必定只可以拿到这个唯一的对象。
 *因此就说，饿汉式单例天生就是线程安全的。
 */
public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();
    private SingletonEager (){}
    public static SingletonEager getInstance() {
    return instance;
    }
}
