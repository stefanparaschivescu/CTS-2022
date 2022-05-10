package state.clase;

public class InCursa implements Stare{
    @Override
    public void actualizareStare(Autobuz autobuz) {
        if (autobuz.getStare() instanceof LaCapatDeLinie){
            System.out.println("Autobuzul"+ autobuz.getNrAutobuz()+ " a plecat in cursa!");
            autobuz.setStare(this);
        }else {
            System.out.println("Autobuzul"+ autobuz.getNrAutobuz()+ " nu poate pleca in cursa in cursa!");
        }
    }
}
