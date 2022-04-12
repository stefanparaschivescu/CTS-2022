package com.stefan.cts.facade.main;

import com.stefan.cts.facade.clase.Autobuz;
import com.stefan.cts.facade.clase.Facade;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz();
        Facade.deschideUsi(autobuz);
        Facade.lasaLiberUsi(autobuz);
    }
}
