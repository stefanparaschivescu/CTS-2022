package command.main;

import command.clase.Autobuz;
import command.clase.ComandaPlecareTraseu;
import command.clase.Command;
import command.clase.Operator;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator();

        Autobuz autobuz = new Autobuz("Mercedes Citaro");
        Autobuz autobuz1 = new Autobuz("Otokar");

        operator.invoca(new ComandaPlecareTraseu(autobuz, 100));
        operator.invoca(new ComandaPlecareTraseu(autobuz1, 200));
        operator.invoca(new ComandaPlecareTraseu(autobuz1, 300));
        operator.invoca(new ComandaPlecareTraseu(autobuz1, 400));

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
    }
}
