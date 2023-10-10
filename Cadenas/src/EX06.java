package Cadenas.src;

public class EX06 {
    public static void main(String[] args) throws Exception {
        String texto = "Cadenas de texto y coleccionables";

        for (int i = 0; i < texto.length(); i++) {
            char character = texto.charAt(i);
            System.out.println("ASCII: " + (int) character + " es equivalente a: " + character);
        }

    }
}
