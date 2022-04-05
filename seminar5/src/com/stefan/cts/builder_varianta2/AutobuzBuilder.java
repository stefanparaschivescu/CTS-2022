package com.stefan.cts.builder_varianta2;

public class AutobuzBuilder implements Builder{
    private int nrLinie;
    private String numeSofer;
    private boolean deschideUsile;
    private boolean areOprire;
    private String textRulat;
    private String model;
    private int numarCalatori;

    public AutobuzBuilder setNrLinie(int nrLinie) {
        this.nrLinie = nrLinie;
        return this;
    }

    public AutobuzBuilder setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
        return this;
    }

    public AutobuzBuilder setDeschideUsile(boolean deschideUsile) {
        this.deschideUsile = deschideUsile;
        return this;
    }

    public AutobuzBuilder setAreOprire(boolean areOprire) {
        this.areOprire = areOprire;
        return this;
    }

    public AutobuzBuilder setTextRulat(String textRulat) {
        this.textRulat = textRulat;
        return this;
    }

    public AutobuzBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public AutobuzBuilder setNumarCalatori(int numarCalatori) {
        this.numarCalatori = numarCalatori;
        return this;
    }

    public AutobuzBuilder() {
        this.nrLinie = 102;
        this.numeSofer = "Andrei";
        this.deschideUsile = false;
        this.areOprire = false;
        this.textRulat = "welcome";
        this.model = "renault";
        this.numarCalatori = 24;
    }

    @Override
    public AutobuzLinie build() {
        return new AutobuzLinie(
                this.nrLinie,
                this.numeSofer,
                this.deschideUsile,
                this.areOprire,
                this.textRulat,
                this.model,
                this.numarCalatori
        );
    }
}
