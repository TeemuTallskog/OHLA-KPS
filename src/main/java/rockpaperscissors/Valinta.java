package rockpaperscissors;

import java.util.Random;

public enum Valinta {
    KIVI,
    PAPERI,
    SAKSET;

    /**
     * Vertaa valintaa toiseen valintaan
     * @param valinta
     * @return WIN - DRAW - LOSS
     */
    public Tulos vertaa(Valinta valinta){
        if(this == valinta) return Tulos.DRAW;
        return voittaa(valinta) ? Tulos.WIN : Tulos.LOSS;
    }

    private boolean voittaa(Valinta valinta){
        switch (this){
            case KIVI:
                return valinta == SAKSET;
            case PAPERI:
                return valinta == KIVI;
            case SAKSET:
                return valinta == PAPERI;
            default:
                return false;
        }
    }

    private static final Random rand = new Random();

    /**
     * @return Palauttaa satunnaisen valinnan
     */
    public static Valinta satunnainenValinta(){
        Valinta[] valinnat = values();
        return valinnat[rand.nextInt(valinnat.length)];
    }
}
