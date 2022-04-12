package com.stefan.cts.strategy.clase;

public class PlataCardSTB implements ModalitatePlata{
    @Override
    public void plateste(float sumaPlata) {
        System.out.println("S-a achitat cu cardul STB in valoare de: " + sumaPlata);
    }
}
