package Cadenas.src;

import java.util.ArrayList;

public class EX08 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Uno");
        lista.add("Dos");
        lista.add("Tres");
        lista.add("Cuatro");

        lista.forEach(item -> System.out.println(item));
    }
}
