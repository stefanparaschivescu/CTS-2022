package com.stefan.cts.factoryMethod;

public class Autobuz  extends MijlocTransport {

    public Autobuz(String numarInmatriculare) {
        super(numarInmatriculare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("numarInmatriculare='").append(numarInmatriculare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
