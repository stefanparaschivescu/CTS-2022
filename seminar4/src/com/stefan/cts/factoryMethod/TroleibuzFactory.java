package com.stefan.cts.factoryMethod;

public class TroleibuzFactory implements Factory {
    @Override
    public MijlocTransport createObject(String numarInmatriculare) {
        return new Autobuz(numarInmatriculare);
    }
}
