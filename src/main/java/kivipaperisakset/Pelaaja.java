
package main.java.kivipaperisakset;

/**
 *
 * @author Ira Dook
 */
public class Pelaaja {

    private int voitot;      // Voittojen lukumäärä
    private int valinta;
    private String valintaString;

    public int setVoitot() {
        voitot++;
        return voitot;
    }

    public void addWin(){this.voitot++;}
    public int getVoitot() {
        return (voitot);
    }

    /**
     * Asettaa pelaajan valinnan ja kääntää Integer valinnan myös String muotoon.
     * @param valinta Integer 0 - Kivi, 1 - Paperi, 2 - Sakset
     */
    public void asetaValinta(int valinta){
        this.valinta = valinta;
        switch(valinta){
            case 0:
                this.valintaString = "Kivi";
                break;
            case 1:
                this.valintaString = "Paperi";
                break;
            case 2:
                this.valintaString = "Sakset";
                break;
        }
    }

    public int getValinta(){return this.valinta;}
    public String getValintaString(){return this.valintaString;}
}
