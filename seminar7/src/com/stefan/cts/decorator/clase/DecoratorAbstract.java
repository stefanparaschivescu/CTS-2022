package com.stefan.cts.decorator.clase;

public abstract class DecoratorAbstract implements Printer{
    Printer printer;

    public DecoratorAbstract(Printer printer) {
        this.printer = printer;
    }

    public abstract void printeazaMesaj();

    @Override
    public void print() {
        printer.print();
    }
}
