package memento.clase;

public class Autobuz {
    private String numeSofer;
    private double consumMediu;
    private int nrLocuri;
    private String model;
    private int anFabricatie;

    public Autobuz(String numeSofer, double consumMediu, int nrLocuri, String model, int anFabricatie) {
        this.numeSofer = numeSofer;
        this.consumMediu = consumMediu;
        this.nrLocuri = nrLocuri;
        this.model = model;
        this.anFabricatie = anFabricatie;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public void setConsumMediu(double consumMediu) {
        this.consumMediu = consumMediu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("numeSofer='").append(numeSofer).append('\'');
        sb.append(", consumMediu=").append(consumMediu);
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append(", model='").append(model).append('\'');
        sb.append(", anFabricatie=").append(anFabricatie);
        sb.append('}');
        return sb.toString();
    }

    public MementoAutobuz creeazaMemento() {
        return new MementoAutobuz(this.numeSofer, this.consumMediu);
    }

    public void restaurareMemento(MementoAutobuz mementoAutobuz) {
        this.numeSofer = mementoAutobuz.getNumeSofer();
        this.consumMediu = mementoAutobuz.getConsumMediu();
    }
}
