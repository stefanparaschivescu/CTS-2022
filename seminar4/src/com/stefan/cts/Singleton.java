package com.stefan.cts;

public class Singleton {
    private static Singleton instanta = null ;

    private Singleton() {

    }

    public static synchronized Singleton getInstance() {
        if (instanta == null) {
            instanta = new Singleton();
        }
        return instanta;
    }
}
