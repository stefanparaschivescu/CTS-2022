package state.clase;

public class LaCapatDeLinie implements Stare{
    @Override
    public void actualizareStare(Autobuz autobuz) {
        if (!(autobuz.getStare() instanceof LaCapatDeLinie)){ // ar mai trebui inca un if pentru ca mai avem inca o conditie, atunci cand autobuzul iesi din service si ajunge la inceput de linie nu la capat
            System.out.println("Autobuzul"+ autobuz.getNrAutobuz()+ " este la capat de linie!");
            autobuz.setStare(this);
        }else {
            System.out.println("Autobuzul"+ autobuz.getNrAutobuz()+ " este deja la capat de linie!");
        }
    }
}
