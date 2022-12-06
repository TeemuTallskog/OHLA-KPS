package main.java.kivipaperisakset;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ValintaVertausTest {
    //0 = kivi, 1 = paperi, 2 = sakset
    @ParameterizedTest
    @CsvSource({"0,0,0", "0,1,2","0,2,1", "1,0,1", "1,1,0", "1,2,2", "2,0,2", "2,1,1", "2,2,0"})
    void vertaaTest(int selection1, int selection2, int winner) {
        Pelaaja p1 = new Pelaaja();
        Pelaaja p2 = new Pelaaja();
        p1.asetaValinta(selection1);
        p2.asetaValinta(selection2);
        int win = ValintaVertaus.vertaa(p1,p2);
        assertEquals(winner, win);
    }
}