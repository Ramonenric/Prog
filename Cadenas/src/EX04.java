package Cadenas.src;

import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introdueix una frase:");
        String frase = scanner.nextLine();

        System.out.println("Introdueix un caracter:");
        char caracter = scanner.nextLine().charAt(0);

        System.out.println("El caracter "+ caracter + " esta en les posicions: ");
        int i = frase.indexOf(caracter);

        while(i >= 0){
            System.out.println(i);
            i = frase.indexOf(caracter, i+1);
        }
    }
}
