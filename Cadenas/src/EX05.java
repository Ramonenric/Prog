package Cadenas.src;

import java.util.Scanner;

public class EX05 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduzca su contraseña:");
        String contraseña = scanner.nextLine();

        boolean mayus = false;
        boolean minus = false;
        boolean simbolo = false;
        boolean digito = false;

        for(int i = 0; i < contraseña.length();i++){
            if(Character.isUpperCase(contraseña.charAt(i))){
                mayus = true;
            }else if(Character.isLowerCase(contraseña.charAt(i))){
                minus = true;
            }else if(Character.isDigit(contraseña.charAt(i))){
                simbolo = true;
            }else{
                digito = true;
            }
        }

        if(mayus && minus && simbolo && digito){
            System.out.println("La contraseña es fuerte");
        }else{
            System.out.println("La contraseña es debil");
        }

    }
}
