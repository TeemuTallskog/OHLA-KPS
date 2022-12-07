package rockpaperscissors;

public class Pelaaja {
    private Valinta valinta;
    private int winCount = 0;

    /**
     * Asettaa valinnan
     * @param valinta
     */
    public void setValinta(Valinta valinta){
        this.valinta = valinta;
    }

    /**
     * Lisää yhden voiton ja palauttaa voitot
     * @return winCount
     */
    public int addWin(){
        winCount++;
        return winCount;
    }

    /**
     * @return Pelaajan valinnan
     */
    public Valinta getValinta(){
        return this.valinta;
    }

    /**
     * @return winCount
     */
    public int getVoitot(){
        return winCount;
    }
}
