package state.main;


import state.clase.Autobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz(129);

        autobuz.ajungeLaCapat();
        autobuz.ieseDinService();
        autobuz.pleacaInCursa();
        autobuz.ajungeLaCapat();
        autobuz.intraInService();
        autobuz.ieseDinService();
    }
}

