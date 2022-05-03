package chain_of_responsabilities.clase;

public class TramvaiHandler extends Handler{
    public TramvaiHandler(int limita) {
        super(limita);
    }

    @Override
    public void afisareRecomandare(int distanta) {
        if (distanta < limita) {
            System.out.println("Recomandarea dvs este sa luati tramvaiul");
        }
        else {
            super.nextHandler.afisareRecomandare(distanta);
        }
    }
}
