package com.stefan.cts.decorator.main;

import com.stefan.cts.decorator.clase.DecoratorAbstract;
import com.stefan.cts.decorator.clase.DecoratorConcret;
import com.stefan.cts.decorator.clase.PrintBilet;
import com.stefan.cts.decorator.clase.Printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new PrintBilet();
        printer.print();

        DecoratorAbstract decoratorAbstract = new DecoratorConcret(printer, "La multi ani!");
        decoratorAbstract.print();
        decoratorAbstract.printeazaMesaj();
    }
}
