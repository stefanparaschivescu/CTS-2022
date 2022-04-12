package com.stefan.cts.proxy.clase;

public class Autobuz implements MijlocTransport{

    private String numeSofer;
    private int nrLocuri;
    private int nrCalatori;

    public Autobuz(String numeSofer, int nrLocuri, int nrCalatori) {
        this.numeSofer = numeSofer;
        this.nrLocuri = nrLocuri;
        this.nrCalatori = nrCalatori;
    }

    public int getNrCalatori() {
        return nrCalatori;
    }

    @Override
    public void opreste() {
        System.out.println("Autobuzul a oprit in statie avand " + nrCalatori + " calatori.");
    }
}
