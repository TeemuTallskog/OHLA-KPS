package main.java.rockpaperscissors;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import rockpaperscissors.Pelaaja;
import rockpaperscissors.Valinta;

import static org.junit.jupiter.api.Assertions.*;

class PelaajaTest {
    Pelaaja p = new Pelaaja();

    @Test
    void setGetValinta() {
        p.setValinta(Valinta.KIVI);
        assertSame(Valinta.KIVI, p.getValinta());
    }

    @Test
    void addWin() {
        p.addWin();
        assertSame(2, p.addWin());
    }
}