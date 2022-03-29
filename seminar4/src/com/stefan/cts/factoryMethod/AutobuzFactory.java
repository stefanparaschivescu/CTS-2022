package com.stefan.cts.factoryMethod;

public class AutobuzFactory implements Factory{
    @Override
    public MijlocTransport createObject(String numarInmatriculare) {
        return new Autobuz(numarInmatriculare);
    }
}
