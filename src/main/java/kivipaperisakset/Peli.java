package main.java.kivipaperisakset;

/**
 *
 * @author Ira Dook
 */
public class Peli {

    public static void main(String[] args){
        Pelaaja p1 = new Pelaaja();
        Pelaaja p2 = new Pelaaja();
        Game peli = new Game(p1,p2);

        while(peli.pelaa());
    }
}
