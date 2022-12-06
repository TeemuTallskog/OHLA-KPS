package main.java.kivipaperisakset;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    @Test
    void pelaaTest(){
        Pelaaja p1 = new Pelaaja();
        Pelaaja p2 = new Pelaaja();
        Game game = new Game(p1, p2);
        while(game.pelaa());
        assertTrue(p1.getVoitot() == 3 || p2.getVoitot() == 3);
    }
}