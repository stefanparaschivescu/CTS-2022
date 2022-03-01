package com.animale;

public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo("zoo1", new IngrijitorZoo("Stefan"));
        Girafa g = new Girafa("girafa 1");
        Zebra z = new Zebra("zebra 1");
        Girafa g1 = new Girafa("girafa 2");
        Zebra z1 = new Zebra("zebra 2");

        zoo.adaugaAnimal(g);
        zoo.adaugaAnimal(g1);
        zoo.adaugaAnimal(z);
        zoo.adaugaAnimal(z1);
        zoo.hranesteAnimale();
    }
}
