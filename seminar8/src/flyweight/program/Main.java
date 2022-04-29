package flyweight.program;

import flyweight.clase.Autobuz;
import flyweight.clase.FabricaLinie;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("Mercedes", 2000, 60);
        Autobuz autobuz2 = new Autobuz("BMW", 2015, 55);
        Autobuz autobuz3 = new Autobuz("Renault", 2012, 30);
        Autobuz autobuz4 = new Autobuz("MAN", 2013, 22);

        FabricaLinie fabricaLinie = new FabricaLinie();
        fabricaLinie.getLinie(133).afiseazaDetaliiAutobuzLinie(autobuz1);
        fabricaLinie.getLinie(133).afiseazaDetaliiAutobuzLinie(autobuz3);
        fabricaLinie.getLinie(137).afiseazaDetaliiAutobuzLinie(autobuz2);
        fabricaLinie.getLinie(137).afiseazaDetaliiAutobuzLinie(autobuz4);

    }

}
