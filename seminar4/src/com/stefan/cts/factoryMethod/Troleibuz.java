package com.stefan.cts.factoryMethod;

public class Troleibuz extends MijlocTransport {
    public Troleibuz(String numarInmatriculare) {
        super(numarInmatriculare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Troleibuz{");
        sb.append("numarInmatriculare='").append(numarInmatriculare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
