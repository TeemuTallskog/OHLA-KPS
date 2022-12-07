package main.java.rockpaperscissors;

import org.junit.jupiter.api.Test;
import rockpaperscissors.Tulos;
import rockpaperscissors.Valinta;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValintojenVertausTest {
    @Test
    void vertaaValintoja(){
        assertSame(Tulos.DRAW, Valinta.KIVI.vertaa(Valinta.KIVI));
        assertSame(Tulos.LOSS, Valinta.KIVI.vertaa(Valinta.PAPERI));
        assertSame(Tulos.WIN, Valinta.KIVI.vertaa(Valinta.SAKSET));

        assertSame(Tulos.WIN, Valinta.PAPERI.vertaa(Valinta.KIVI));
        assertSame(Tulos.DRAW, Valinta.PAPERI.vertaa(Valinta.PAPERI));
        assertSame(Tulos.LOSS, Valinta.PAPERI.vertaa(Valinta.SAKSET));

        assertSame(Tulos.LOSS, Valinta.SAKSET.vertaa(Valinta.KIVI));
        assertSame(Tulos.WIN, Valinta.SAKSET.vertaa(Valinta.PAPERI));
        assertSame(Tulos.DRAW, Valinta.SAKSET.vertaa(Valinta.SAKSET));
    }

    @Test
    void generoiValinta(){
        for(int i = 0; i < 90; i++){
            Valinta val = Valinta.satunnainenValinta();
            assertTrue(val == Valinta.KIVI || val == Valinta.PAPERI || val == Valinta.SAKSET);
        }
    }
}
