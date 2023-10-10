package Cadenas.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EX09 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Uno");
        lista.add("Dos");
        lista.add("Tres");
        lista.add("Cuatro");

        String[] array = new String[lista.size()];

        for(int i = 0; i < lista.size();i++){
            array[i] = lista.get(i);
        }

        System.out.println("Array: "+Arrays.toString(array));
    }
}
