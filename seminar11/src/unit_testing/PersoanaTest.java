package unit_testing;

import static org.junit.Assert.*;

public class PersoanaTest {
    private Persoana persoana;

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.Test
    public void getSexRight() {
        persoana = new Persoana("Ana","6000524460011");
        String sex = persoana.getSex();
        assertEquals("F",sex);
    }

    @org.junit.Test
    public void getSexBoundary() {
        persoana = new Persoana("Stefan","5000101460011");
        String sex = persoana.getSex();
        assertEquals("M",sex);
    }
    @org.junit.Test
    public void getSexCrossCheck() {
        persoana = new Persoana("Stefan","6000101460011");
        int primaCifra = persoana.CNP.charAt(0);
        String sex = persoana.getSex();
        int cifra;
        if (sex == "M") {
            cifra =1;
        }
        else {
            cifra =2;
        }
        assertEquals(cifra % 2 == 1, primaCifra % 2 == 1);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexErrorCondition() {
        persoana = new Persoana("Stefan","0000101460011");
        String sex = persoana.getSex();
    }

    @org.junit.Test(timeout = 100)
    public void getSexPerformance() {
        persoana = new Persoana("Stefan", "5000101460011");
        String sex = persoana.getSex();
    }

    @org.junit.Test
    public void getSexOutpuFormat() {
        persoana = new Persoana("Stefan", "5000101460011");
        String sex = persoana.getSex();
        assertEquals(1, sex.length());
    }

    @org.junit.Test
    public void getSexRangeBetween1800And1899() {
        persoana = new Persoana("Stefan", "3000101460011");
        String sex = persoana.getSex();
        assertEquals("M", sex);
    }

    @org.junit.Test(expected = NullPointerException.class)
    public void getSexExistence() {
        persoana = new Persoana("Stefan", null);
        String sex = persoana.getSex();
    }
}