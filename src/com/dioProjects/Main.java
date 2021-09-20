package com.dioProjects;

import com.dioProjects.singleton.SingletonEager;
import com.dioProjects.singleton.SingletonLazy;
import com.dioProjects.singleton.SingletonLazyHolder;

public class Main {

    public static void main(String[] args) {
	// Teste Design Pattern Singleton:
        SingletonLazy singletonLazy = SingletonLazy.getSingletonLazy();
        System.out.println(singletonLazy);
        singletonLazy = SingletonLazy.getSingletonLazy();
        System.out.println(singletonLazy);

        SingletonEager singletonEager = SingletonEager.getSingletonEager();
        System.out.println(singletonEager);
        singletonEager = SingletonEager.getSingletonEager();
        System.out.println(singletonEager);

        SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getSingletonLazyHolder();
        System.out.println(singletonLazyHolder);
        singletonLazyHolder = new SingletonLazyHolder();
        System.out.println(singletonLazyHolder);


    }
}
