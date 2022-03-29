package com.stefan.cts;

import com.stefan.cts.Familie.MijlocTransport;

public class Main {
    public static void main(String[] args) {
//        Singleton s = Singleton.getInstance();
//        Singleton s2 = Singleton.getInstance();
//
//        System.out.println(s);
//        System.out.println(s2);

        Factory factory = new Factory();
        MijlocTransport autobuz = factory.createObject(TipTransport.AUTOBUZ, "222");
        MijlocTransport troleibuz = factory.createObject(TipTransport.TROLEIBUZ, "222");
        MijlocTransport tramvai = factory.createObject(TipTransport.TRAMVAI, "222");

        System.out.println(autobuz);
        System.out.println(troleibuz);
        System.out.println(tramvai);
    }
}
