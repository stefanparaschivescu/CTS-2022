package com.stefan.cts.strategy.clase;

public class PlataSMS implements ModalitatePlata{
    @Override
    public void plateste(float sumaPlata) {
        System.out.println("S-a achitat prin SMS suma de " + sumaPlata + "lei.");
    }
}
