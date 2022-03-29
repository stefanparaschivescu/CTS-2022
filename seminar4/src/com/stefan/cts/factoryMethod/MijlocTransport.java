package com.stefan.cts.factoryMethod;

public abstract class MijlocTransport {
    String numarInmatriculare;

    protected MijlocTransport(String numarInmatriculare) {
        this.numarInmatriculare = numarInmatriculare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MijlocTransport{");
        sb.append("numarInmatriculare='").append(numarInmatriculare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
