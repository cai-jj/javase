package com.cjj.singleton;

/**
 * 饿汉单例
 */
//public class Singleton {
//    private static final Singleton instance = new Singleton();
//    private Singleton() {}
//
//    public static Singleton getInstance() {
//        return instance;
//    }
//}

/**
 * 懒汉单例
 */
//public class Singleton {
//    private static Singleton instance;
//
//    private Singleton() {}
//
//    public static synchronized Singleton getInstance() {
//        if(instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }
//}

public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {}

    public static  Singleton getInstance() {
        if(instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
