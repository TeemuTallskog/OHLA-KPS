package main.java.kivipaperisakset;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PelaajaTest {

    @Test
    void addWin() {
        Pelaaja p = new Pelaaja();
        assertEquals(p.getVoitot(), 0);
        p.addWin();
        assertEquals(p.getVoitot(), 1);
        p.addWin();
        assertEquals(p.getVoitot(), 2);
    }

    @ParameterizedTest
    @CsvSource({"0,Kivi", "1,Paperi", "2,Sakset"})
    void asetaValinta(int valinta, String sValinta) {
        Pelaaja p = new Pelaaja();
        p.asetaValinta(valinta);
        assertEquals(sValinta, p.getValintaString());
        assertEquals(valinta, p.getValinta());
    }
}