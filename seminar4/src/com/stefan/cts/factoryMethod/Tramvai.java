package com.stefan.cts.factoryMethod;

public class Tramvai extends MijlocTransport {
    public Tramvai(String numarInmatriculare) {
        super(numarInmatriculare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tramvai{");
        sb.append("numarInmatriculare='").append(numarInmatriculare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
