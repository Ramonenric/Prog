package Cadenas.src;

import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introdueix una frase:");
        String frase = scanner.nextLine();

        System.out.println("Introdueix un caracter:");
        char caracter = scanner.nextLine().charAt(0);

        System.out.println("El caracter "+ caracter + " esta en les posicions: ");


        for(int i = 0; i < frase.length();i++){
            if(frase.charAt(i) == caracter){
                System.out.println(i);
            }
        }
    }
}
