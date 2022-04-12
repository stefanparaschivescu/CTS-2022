package com.stefan.cts.proxy.main;

import com.stefan.cts.proxy.clase.Autobuz;
import com.stefan.cts.proxy.clase.AutobuzNoapte;
import com.stefan.cts.proxy.clase.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        MijlocTransport autobuz = new Autobuz("George", 20, 10);
        autobuz.opreste();

        MijlocTransport autobuzNoapte = new AutobuzNoapte((Autobuz) autobuz);
        autobuzNoapte.opreste();
    }
}
