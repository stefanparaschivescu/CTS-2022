package observer.clase;

public class Autobuz extends Subiect{
    private int nrLinie;

    public Autobuz(int nrLinie) {
        this.nrLinie = nrLinie;
    }

    @Override
    public void notificaCalatori() {
        for (Observer calator : calatori) {
            calator.primesteMesaj("Autobuzul " + nrLinie + " a " +
                    "plecat de la capatul linie.");
        }
    }
}
