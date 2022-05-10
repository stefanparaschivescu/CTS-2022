package state.clase;

public class Autobuz {
    private Stare stare;
    private int nrAutobuz;

    public Autobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
        stare= new LaCapatDeLinie(); // ii cream un obiect nou
    }

    public Stare getStare() {
        return stare;
    }

    protected void setStare(Stare stare) { // protected ca sa nu ii pot schimba starea din main
        this.stare = stare;
    }

    public int getNrAutobuz() {
        return nrAutobuz;
    }

    public void setNrAutobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
    }

    public void pleacaInCursa(){
        InCursa inCursa = new InCursa();
        inCursa.actualizareStare(this); // se actualizeaza starea autobuzului de acum pe care il folosim
    }
    public void intraInService(){
        new LaReparat().actualizareStare(this); // se creeaza un obiect nou de tipul LaReparat, iar acesta se apeleaza in cascada
    }
    public void ieseDinService(){
        new LaCapatDeLinie().actualizareStare(this);
    }
    public void ajungeLaCapat(){
        new LaCapatDeLinie().actualizareStare(this);
    }
}
