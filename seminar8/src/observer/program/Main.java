package observer.program;

import observer.clase.Autobuz;
import observer.clase.Calator;
import observer.clase.Subiect;

public class Main {
    public static void main(String[] args) {
        Subiect autobuz = new Autobuz(313);

        Calator calator1 = new Calator("Popescu");
        Calator calator2 = new Calator("Ionescu");
        Calator calator3 = new Calator("Pascu");
        Calator calator4 = new Calator("Frone");

        autobuz.adaugaCalator(calator1);
        autobuz.adaugaCalator(calator2);
        autobuz.notificaCalatori();
        autobuz.adaugaCalator(calator3);
        autobuz.adaugaCalator(calator4);
        autobuz.notificaCalatori();
    }
}
