package com.languoxing.design_patterns.singleton_pattern.lazy;

/*
 * 假设有两个线程：线程1，线程2，都需要使用这个单例对象。
 * 而恰巧，线程1在判断完s==null后突然交换了cpu的使用权，变为线程2执行，
 * 由于s仍然为null，那么线程2中就会创建这个Singleton的单例对象。
 * 之后线程1拿回cpu的使用权，而正好线程1之前暂停的位置就是判断s是否为null之后，创建对象之前。
 * 这样线程1又会创建一个新的Singleton对象。
 */
public class SingletonLazy {
    private static SingletonLazy instance;
    private SingletonLazy (){}

    public static SingletonLazy getInstance() {
    if (instance == null) {
        //线程在这里等待
        instance = new SingletonLazy();
    }
    return instance;
    }
}
