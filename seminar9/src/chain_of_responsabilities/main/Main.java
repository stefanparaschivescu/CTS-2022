package chain_of_responsabilities.main;

import chain_of_responsabilities.clase.*;

public class Main {
    public static void main(String[] args) {
        Handler troleibuz = new TroleibuzHandler(3);
        Handler autobuz = new AutobuzHandler(5);
        Handler tramvai = new TramvaiHandler(10);
        Handler metrou = new MetrouHandler(1000);

        troleibuz.setNextHandler(autobuz);
        autobuz.setNextHandler(tramvai);
        tramvai.setNextHandler(metrou);

        troleibuz.afisareRecomandare(8);
        troleibuz.afisareRecomandare(1);
        troleibuz.afisareRecomandare(14);
        troleibuz.afisareRecomandare(4);

        System.out.println("\nPentru Cluj:");
        Handler troleibuzCluj = new TroleibuzHandler(5);
        Handler autobuzCluj = new AutobuzHandler(1000);
        Handler tramvaiCluj = new TramvaiHandler(3);
        Handler metrouCluj = new MetrouHandler(2);

        metrouCluj.setNextHandler(tramvaiCluj);
        tramvaiCluj.setNextHandler(troleibuzCluj);
        troleibuzCluj.setNextHandler(autobuzCluj);

        metrouCluj.afisareRecomandare(3);
        metrouCluj.afisareRecomandare(6);
        metrouCluj.afisareRecomandare(1);
    }
}
