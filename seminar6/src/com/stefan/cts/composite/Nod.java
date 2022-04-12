package com.stefan.cts.composite;

public interface Nod {
    void adaugaNod(Nod nod) throws Exception;
    void stergeNod(Nod nod) throws Exception;
    Nod getNod(int poz) throws Exception;
    void afiseazaDescriere();
    float calculeazaSumaGarantie(float pretPerLoc);
}
