package com.stefan.cts.strategy.clase;

public class PlataCardBancar implements ModalitatePlata{
    @Override
    public void plateste(float sumaPlata) {
        System.out.println("S-a achitat cu cardul bancar suma de " + sumaPlata + " lei.");
    }
}
