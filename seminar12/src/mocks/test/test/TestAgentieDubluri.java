package mocks.test.test;

import mocks.agentie.AgentieTurism;
import mocks.agentie.IPachetTuristic;
import mocks.test.categorii.CategorieUtilizareBoundary;
import mocks.test.categorii.CategorieUtilizareDummy;
import mocks.test.categorii.CategorieUtilizareFake;
import mocks.test.dubluri.PachetDummy;
import mocks.test.dubluri.PachetFake;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

public class TestAgentieDubluri {
    @Test
    @Category(CategorieUtilizareDummy.class)
    public void adaugaPachetTest() {
        IPachetTuristic pachetDummy = new PachetDummy();
        AgentieTurism agentieTurism = new AgentieTurism();

        agentieTurism.adaugaPachet(pachetDummy);
        assertEquals(1, agentieTurism.getNrPacheteTuristice());
    }

    @Test
    @Category(CategorieUtilizareFake.class)
    public void testCalculeazaPretTotal() {
        PachetFake pachetFake1 = new PachetFake();
        PachetFake pachetFake2 = new PachetFake();

        pachetFake1.setValoareGetPret(1000);
        pachetFake2.setValoareGetPret(1500);

        AgentieTurism agentieTurism = new AgentieTurism();
        agentieTurism.adaugaPachet(pachetFake1);
        agentieTurism.adaugaPachet(pachetFake2);

        assertEquals(2500, agentieTurism.calculareSumaTotalaPachete(), 0.001);
    }

    @Test
    @Category(CategorieUtilizareFake.class)
    public void testInverseCalculeazaPretTotal() {
        PachetFake pachetFake1 = new PachetFake();
        PachetFake pachetFake2 = new PachetFake();

        pachetFake1.setValoareGetPret(1000);
        pachetFake2.setValoareGetPret(1500);

        AgentieTurism agentieTurism = new AgentieTurism();
        agentieTurism.adaugaPachet(pachetFake1);
        agentieTurism.adaugaPachet(pachetFake2);

        double total = agentieTurism.calculareSumaTotalaPachete();

        assertEquals(pachetFake1.getPret(), total - pachetFake2.getPret(), 0.01);
    }

    @Test
    @Category(CategorieUtilizareBoundary.class)
    public void testBoundaryCalculeazaPretTotal() {
        AgentieTurism agentieTurism = new AgentieTurism();

        double suma = agentieTurism.calculareSumaTotalaPachete();

        assertEquals(0, suma,0.01);
    }

    @Test(timeout = 100)
    @Category(CategorieUtilizareFake.class)
    public void testPerformanceCalculeazaPretTotal() {
        AgentieTurism agentieTurism = new AgentieTurism();
        for (int i=0; i<100; i++) {
            PachetFake pachetFake = new PachetFake();
            pachetFake.setValoareGetPret(i * 100.5);
            agentieTurism.adaugaPachet(pachetFake);
        }

        double total = agentieTurism.calculareSumaTotalaPachete();
    }
}
