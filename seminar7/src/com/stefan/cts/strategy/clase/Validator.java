package com.stefan.cts.strategy.clase;

public class Validator {
    private ModalitatePlata modalitatePlata;
    private float sumaPlata;

    public Validator(ModalitatePlata modalitatePlata, float sumaPlata) {
        this.modalitatePlata = modalitatePlata;
        this.sumaPlata = sumaPlata;
    }

    public void setModalitatePlata(ModalitatePlata modalitatePlata) {
        this.modalitatePlata = modalitatePlata;
    }

    public void platesteCalatorie() {
        modalitatePlata.plateste(sumaPlata);
    }

}
