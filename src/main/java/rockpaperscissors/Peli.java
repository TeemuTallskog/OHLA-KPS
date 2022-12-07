package rockpaperscissors;


public class Peli {
    private final Pelaaja p1;
    private final Pelaaja p2;

    private int rounds = 0;

    public Peli(Pelaaja p1, Pelaaja p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    /**
     * Pelaa peliä kunnes yhdellä pelaajalla on kolme voittoa.
     */
    public void aloita(){
        while(pelaa());
    }

    /**
     * Pelaa yhden erän.
     * @return true jos peli ei ole vielä ohi, false jos peli on päättynyt.
     */
    private boolean pelaa(){
        newRound();
        teeValinnat();
        printValinnat();

        Tulos tulos = p1.getValinta().vertaa(p2.getValinta());

        switch(tulos){
            case DRAW:
                System.out.println("Tasapeli");
                break;
            case WIN:
                System.out.println("Pelaaja 1 voittaa!");
                p1.addWin();
                break;
            case LOSS:
                System.out.println("Pelaaja 2 voittaa!");
                p2.addWin();
                break;
        }
        if(p1.getVoitot() >= 3 || p2.getVoitot() >= 3){
            endGamePrint();
            return false;
        }
        return true;
    }

    /**
     * Arvoo valinnat pelaajille.
     */
    private void teeValinnat(){
        p1.setValinta(Valinta.satunnainenValinta());
        p2.setValinta(Valinta.satunnainenValinta());
    }

    private void newRound(){
        this.rounds++;
        System.out.println("Erä: " + rounds + " =====================================");
    }

    private void printValinnat(){
        System.out.println("Pelaaja 1: " + p1.getValinta()
                + "\n\t Pelaaja 1:llä koossa " + p1.getVoitot() + " Voittoa");

        System.out.println("Pelaaja 2: " + p2.getValinta()
                + "\n\t Pelaaja 2:lla koossa " + p2.getVoitot() + " Voittoa");
    }

    private void endGamePrint(){
        System.out.println("\nPELI PÄÄTTYI TULOKSIN:"
                + "\nPelaaja 1 - Pelaaja 2"
                + "\n----" + p1.getVoitot() + "-----------" + p2.getVoitot() + "----");
    }
}
