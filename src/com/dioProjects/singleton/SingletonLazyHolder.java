package com.dioProjects.singleton;

/**
 * @author fellipe
 * @created 20/09/2021
 * @see "https://stackoverflow.com/questions/15019306/regarding-static-holder-singleton-pattern/24018148#24018148"
 */

public class SingletonLazyHolder {

    //classe com função de encapsular a instância:
    private static class InstanceHolder{
        public static SingletonLazyHolder singletonLazyHolder = new SingletonLazyHolder();
    }

    public SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getSingletonLazyHolder() {
        return InstanceHolder.singletonLazyHolder;
    }
}


