package com.dioProjects.singleton;

/**
 * @author fellipe
 */

public class SingletonLazy {


    private static SingletonLazy singletonLazy;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getSingletonLazy() {
        //Verifica se instância é nula:
        if (singletonLazy == null){
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }
}
