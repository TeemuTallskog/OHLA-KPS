package main.java.rockpaperscissors;


import org.junit.jupiter.api.Test;
import rockpaperscissors.Pelaaja;
import rockpaperscissors.Peli;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PeliTest {
    @Test
    void pelaaTest(){
        Pelaaja p1 = new Pelaaja();
        Pelaaja p2 = new Pelaaja();
        Peli game = new Peli(p1, p2);
        game.aloita();
        assertTrue(p1.getVoitot() == 3 || p2.getVoitot() == 3);
    }
}
