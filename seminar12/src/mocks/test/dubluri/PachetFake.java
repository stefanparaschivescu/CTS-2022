package mocks.test.dubluri;

import mocks.agentie.IPachetTuristic;

public class PachetFake implements IPachetTuristic {
    private boolean valoarePoateRezerva;
    private double valoareGetPret;

    public PachetFake() {
    }

    public PachetFake(boolean valoarePoateRezerva, double valoareGetPret) {
        this.valoarePoateRezerva = valoarePoateRezerva;
        this.valoareGetPret = valoareGetPret;
    }

    public void setValoarePoateRezerva(boolean valoarePoateRezerva) {
        this.valoarePoateRezerva = valoarePoateRezerva;
    }

    public void setValoareGetPret(double valoareGetPret) {
        this.valoareGetPret = valoareGetPret;
    }

    @Override
    public boolean poateRezerva() {
        return valoarePoateRezerva;
    }

    @Override
    public void aplicaDiscountVarstnici(int procent) {

    }

    @Override
    public Double getPret() {
        return valoareGetPret;
    }
}
