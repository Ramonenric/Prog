package Cadenas.src;

import java.util.Scanner;

public class EX02 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduzca el primer nombre: ");
        String nombre1 = scanner.nextLine();

        System.out.println("Introduzca el segundo nombre: ");
        String nombre2 = scanner.nextLine();

        char[] arrayNombre1 = new char[nombre1.length()];
        char[] arrayNombre2 = new char[nombre2.length()];


        for(int i = 0; i < nombre1.length();i++){
            arrayNombre1[i] = nombre1.charAt(i);
        }

        for(int i = 0; i < nombre2.length();i++){
            arrayNombre2[i] = nombre2.charAt(i);
        }

        int maxlen = arrayNombre1.length > arrayNombre2.length ? arrayNombre1.length : arrayNombre2.length;
        
        for(int i = 0; i < maxlen;i++) {
            if(i < arrayNombre1.length){
                System.out.print(arrayNombre1[i]);
            }
            if(i < arrayNombre2.length){
                System.out.print(arrayNombre2[i]);
            }
        }
    }
}