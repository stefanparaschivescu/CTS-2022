package com.stefan.cts.prototype;

public class Tramvai implements MijlocTransport{
    private String numeVatman;

    public Tramvai(String numeVatman) {
        this.numeVatman = numeVatman;
    }

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (MijlocTransport) super.clone();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tramvai{");
        sb.append("numeVatman='").append(numeVatman).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
