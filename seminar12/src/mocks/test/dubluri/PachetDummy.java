package mocks.test.dubluri;

import mocks.agentie.IPachetTuristic;
import mocks.agentie.PachetTuristic;
import mocks.persoana.IPersoana;

public class PachetDummy implements IPachetTuristic {

    @Override
    public boolean poateRezerva() {
        return false;
    }

    @Override
    public void aplicaDiscountVarstnici(int procent) {

    }

    @Override
    public Double getPret() {
        return 1.2;
    }
}
