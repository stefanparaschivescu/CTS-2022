package com.stefan.cts.adapter.main;

import com.stefan.cts.adapter.autobuz.AdapterValidatorObiecte;
import com.stefan.cts.adapter.autobuz.Autobuz;
import com.stefan.cts.adapter.metrou.ValidatorMetrou;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz();
        ValidatorMetrou metrou = new ValidatorMetrou();

        AdapterValidatorObiecte adaptorObiecte = new AdapterValidatorObiecte(metrou);
        adaptorObiecte.validateBilet();
        adaptorObiecte.validareAbonament();
    }
}
