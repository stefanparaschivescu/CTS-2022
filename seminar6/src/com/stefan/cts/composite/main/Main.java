package com.stefan.cts.composite.main;

import com.stefan.cts.composite.Autobuz;
import com.stefan.cts.composite.Flota;
import com.stefan.cts.composite.Nod;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("BMW", "E445", 75);
        Autobuz autobuz2 = new Autobuz("Mercedes", "Tour", 55);
        Autobuz autobuz3 = new Autobuz("Renault", "Van", 87);
        Autobuz autobuz4 = new Autobuz("Otokar", "F-222", 66);
        Autobuz autobuz5 = new Autobuz("MAN", "Bus", 123);
        Autobuz autobuz6 = new Autobuz("CCC", "DD", 22);

        Nod mari = new Flota("Autobuze mari");
        Nod medii = new Flota("Autobuze medii");
        Nod mici = new Flota("Autobuze mici");

        Nod flota = new Flota("flota");

        try {
            mici.adaugaNod(autobuz2);
            mici.adaugaNod(autobuz6);

            medii.adaugaNod(autobuz4);
            medii.adaugaNod(autobuz1);

            mari.adaugaNod(autobuz5);
            mari.adaugaNod(autobuz3);

            flota.adaugaNod(mici);
            flota.adaugaNod(medii);
            flota.adaugaNod(mari);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Intreaga flota: " + flota.calculeazaSumaGarantie(2));
        System.out.println("Flota medie: " + medii.calculeazaSumaGarantie(2));
    }
}
