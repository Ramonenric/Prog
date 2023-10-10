package Cadenas.src;

import java.util.Scanner;

public class EX01{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduzca su nombre completo: ");
        String nombre = scanner.nextLine();
        char inicial = nombre.charAt(0);
        String saltarNombre = nombre.substring(nombre.indexOf(' ') + 1);
        System.out.println(saltarNombre+", "+inicial+".");
    }
}