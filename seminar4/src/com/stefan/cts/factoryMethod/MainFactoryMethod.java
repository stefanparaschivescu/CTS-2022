package com.stefan.cts.factoryMethod;

public class MainFactoryMethod {
    public static void main(String[] args) {
        Factory autobuzFactory = new AutobuzFactory();
        MijlocTransport autobuz = autobuzFactory.createObject("222");
        System.out.println(autobuz);

        Factory tramvaiFactory = new TramvaiFactory();
        MijlocTransport tramvai = tramvaiFactory.createObject("222");
        System.out.println(tramvai);

        Factory troleibuzFactory = new TroleibuzFactory();
        MijlocTransport troleibuz = troleibuzFactory.createObject("222");
        System.out.println(troleibuz);
    }
}
