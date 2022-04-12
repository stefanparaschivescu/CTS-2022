package com.stefan.cts.proxy.clase;

public class AutobuzNoapte implements MijlocTransport{
    Autobuz autobuz;

    public AutobuzNoapte(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opreste() {
        if (autobuz.getNrCalatori() > 0) {
            System.out.println("Autobuzul de noapte a oprit in statie avand " + autobuz.getNrCalatori() + " calatori.");
        }
        else {
            System.out.println("Autobuzul se intoarce la autobaza.");
        }
    }
}
