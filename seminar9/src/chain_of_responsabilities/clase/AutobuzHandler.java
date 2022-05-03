package chain_of_responsabilities.clase;

public class AutobuzHandler extends Handler{
    public AutobuzHandler(int limita) {
        super(limita);
    }

    @Override
    public void afisareRecomandare(int distanta) {
        if (distanta < limita) {
            System.out.println("Recomandarea dvs este sa luati autobuzul");
        }
        else {
            super.nextHandler.afisareRecomandare(distanta);
        }
    }
}
