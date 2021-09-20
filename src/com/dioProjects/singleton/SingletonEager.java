package com.dioProjects.singleton;


public class SingletonEager {

    private static SingletonEager singletonEager = new SingletonEager();

    public SingletonEager() {
        super();
    }

    public static SingletonEager getSingletonEager() {
        return singletonEager;
    }
}
