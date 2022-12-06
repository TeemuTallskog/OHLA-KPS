package main.java.kivipaperisakset;

public class Game {
    private Pelaaja p1;
    private Pelaaja p2;

    private int rounds = 0;

    public Game(Pelaaja p1, Pelaaja p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    /**
     * Arvoo valinnat pelaajille.
     */
    private void teeValinnat(){
        p1.asetaValinta(ValintaGeneraattori.generoiValinta());
        p2.asetaValinta(ValintaGeneraattori.generoiValinta());
    }


    /**
     * Pelaa yhden erän.
     * @return true jos peli ei ole vielä ohi, false jos peli on päättynyt.
     */
    public boolean pelaa(){
        rounds++;
        System.out.println("Erä: " + rounds + " ================");

        teeValinnat();
        printValinnat();

        int voittaja = ValintaVertaus.vertaa(p1,p2);

        if(voittaja == 0){
            System.out.println("Tasapeli");
        }else{
            System.out.println("Pelaaja " + voittaja + " voittaa");
            int i = voittaja > 1 ? p2.setVoitot() : p1.setVoitot();
            if(i >= 3){
                endGame();
                return false;
            };
        }
        return true;
    }

    /**
     * Tulostaa pelaajien valinnat ja voitot
     */
    private void printValinnat(){
        System.out.println("Pelaaja 1: " + p1.getValintaString()
        + "\n\t Pelaaja 1:llä koossa " + p1.getVoitot() + " Voittoa");

        System.out.println("Pelaaja 2: " + p2.getValintaString()
                + "\n\t Pelaaja 2:lla koossa " + p2.getVoitot() + " Voittoa");
    }

    /**
     * Tulostaa pelin päättymis tulostuksen.
     */
    private void endGame(){
        System.out.println("\nPELI PÄÄTTYI TULOKSIN:"
                + "\nPelaaja 1 - Pelaaja 2"
                + "\n----" + p1.getVoitot() + "-----------" + p2.getVoitot() + "----");
    }

}
