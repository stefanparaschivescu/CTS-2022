package mocks.test.test;

import mocks.agentie.PachetTuristic;
import mocks.test.categorii.CategorieUtilizareBoundary;
import mocks.test.categorii.CategorieUtilizareFake;
import mocks.test.dubluri.PersoanaFake;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class TestPachetTuristic {
    @Test
    @Category(CategorieUtilizareFake.class)
    public void testPoateRezervaVarstaEligibila() {
        PersoanaFake persoanaFake = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Bulgaria", 3500.2);

        persoanaFake.setValoareGetVarsta(22);

        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    @Category(CategorieUtilizareFake.class)
    public void testPoateRezervaVarstaNeeligibila() {
        PersoanaFake persoanaFake = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Bulgaria", 3500.2);

        persoanaFake.setValoareGetVarsta(17);

        assertFalse(pachetTuristic.poateRezerva());
    }

    @Test
    @Category(CategorieUtilizareFake.class)
    public void testAplicaDiscountVarstnici() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setValoareGetVarsta(67);

        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Bulgaria", 500.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        double pretDiscount = pachetTuristic.getPret();

        assertEquals(450.0, pretDiscount, 0.1);
    }

    @Test
    @Category({CategorieUtilizareBoundary.class, CategorieUtilizareFake.class})
    public void testAplicaDiscountTineri() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setValoareGetVarsta(22);

        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Bulgaria", 500.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        double pretDiscount = pachetTuristic.getPret();

        assertEquals(500.0, pretDiscount, 0.1);
    }
}
