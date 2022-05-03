package memento.main;

import memento.clase.Autobuz;
import memento.clase.ManagerMemento;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("John", 11.7, 21, "MERCEDES", 2010);
        System.out.println(autobuz.toString());

        ManagerMemento managerMemento = new ManagerMemento();
        managerMemento.addMemento(autobuz.creeazaMemento());

        autobuz.setNumeSofer("Mircea");
        autobuz.setConsumMediu(10.2);

        managerMemento.addMemento(autobuz.creeazaMemento());

        System.out.println(autobuz.toString());
        autobuz.setNumeSofer("Andrei");
        autobuz.setConsumMediu(5);
        System.out.println(autobuz.toString());

        autobuz.restaurareMemento(managerMemento.getMemento(0));
        System.out.println(autobuz.toString());
    }
}
