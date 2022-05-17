package unit_testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GetVarstaTest {
    private Persoana persoana;

    @org.junit.Test
    public void getVarstaRight() {
        persoana = new Persoana("Stefan", "5010313030012");
        int varsta = persoana.getVarsta();
        assertEquals(21, varsta);
    }

    @org.junit.Test
    public void getVarstaBoundary1800() {
        persoana = new Persoana("Stefan", "3000101030012");
        int varsta = persoana.getVarsta();
        assertEquals(222, varsta);
    }

    @org.junit.Test
    public void getVarstaBoundary1900() {
        persoana = new Persoana("Stefan", "3991231030012");
        int varsta = persoana.getVarsta();
        assertEquals(122, varsta);
    }

    public void getVarstaBoundaryZiuaCurenta() {
        persoana = new Persoana("Stefan", "5220517030012");
        int varsta = persoana.getVarsta();
        assertEquals(0, varsta);
    }

    @org.junit.Test
    public void getVarstaBoundaryZiuaUrmatoare() {
        persoana = new Persoana("Stefan", "5040520030012");
        int varsta = persoana.getVarsta();
        assertEquals(17, varsta);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getVarstaErrorConditionVarsta() {
        persoana = new Persoana("Stefan", "5220518030012");
        int varsta = persoana.getVarsta();
    }

    @org.junit.Test(expected = NullPointerException.class)
    public void getVarstaErrorConditionCNP() {
        persoana = new Persoana("Stefan", null);
        int varsta = persoana.getVarsta();
    }

    @org.junit.Test(timeout = 100)
    public void getVarstaPerformance() {
        persoana = new Persoana("Stefan", "5000101460011");
        int varsta = persoana.getVarsta();
    }

    @org.junit.Test
    public void getVarstaOrder() {
        persoana = new Persoana("Stefan", "5010101460011");
        int varsta = persoana.getVarsta();
        Persoana persoana1 = new Persoana("Dan", "5000101460011");
        int varsta1 = persoana1.getVarsta();
        assertTrue(varsta1 > varsta);
    }
}
