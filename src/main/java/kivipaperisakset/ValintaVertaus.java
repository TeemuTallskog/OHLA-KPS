package main.java.kivipaperisakset;

public class ValintaVertaus {
    /**
     * Voitto matriisi, joka osoittaa voittajan kun x = pelaaja 1 ja y = pelaaja 2
     * 0 = tasapeli, 1 = pelaaja 1 voittaa, 2 = pelaaja 2 voittaa
     */
    private static final int[][] winLossTable = {
            //k,p,s
            {0,1,2}, // k
            {2,0,1}, // p
            {1,2,0}  // s
    };

    /**
     * Ottaa syötteeksi kaksi pelaajaa ja palauttaa voittajan pelaajien valintojen perusteella.
     * @param p1 Pelaaja 1
     * @param p2 Pelaaja 2
     * @return 0 = tasapeli, 1 = pelaaja 1 voittaa, 2 = pelaaja 2 voittaa
     */
    public static int vertaa(Pelaaja p1, Pelaaja p2){
        int p1Valinta = p1.getValinta();
        int p2Valinta = p2.getValinta();

        return winLossTable[p2Valinta][p1Valinta];
    }
}