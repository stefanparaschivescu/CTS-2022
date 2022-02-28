package com.animale;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String nume;
    private IngrijitorZoo ingrijitorZOO;
    private List<Animal> animale;

    public Zoo(String nume, IngrijitorZoo ingrijitorZOO) {
        this.nume = nume;
        this.ingrijitorZOO = ingrijitorZOO;
        this.animale = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public IngrijitorZoo getIngrijitorZOO() {
        return ingrijitorZOO;
    }

    public void setIngrijitorZOO(IngrijitorZoo ingrijitorZOO) {
        this.ingrijitorZOO = ingrijitorZOO;
    }

    public List<Animal> getAnimale() {
        return animale;
    }

    public void adaugaAnimal(Animal animal){
        animale.add(animal);
    }

    public void hranesteAnimale(){
        for(Animal a :animale)
            ingrijitorZOO.hranesteAnimal(a,"legume");
    }
}
