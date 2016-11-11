package com.guoyang.singleton;

/**
 * Created by L'Accordeur on 2016/11/11.
 */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance != null) {
            uniqueInstance = new Singleton();
        }

        return uniqueInstance;
    }
}
