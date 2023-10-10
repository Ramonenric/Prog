package Cadenas.src;

import java.util.ArrayList;
import java.util.Iterator;

public class EX07 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Uno");
        lista.add("Dos");
        lista.add("Tres");
        lista.add("Cuatro");

        Iterator<String> iterator = lista.iterator();

        while (iterator.hasNext()) {
            String elemento = iterator.next();
            System.out.println(elemento);
        }
    }
}
