package main.java.kivipaperisakset;

public final class ValintaGeneraattori {
    /**
     * arvoo luvun 0-2
     * @return 0 - Kivi, 1 - Paperi, 2 - Sakset
     */
    public static int generoiValinta(){
        return (int) (Math.random() * 3);
    }
}
