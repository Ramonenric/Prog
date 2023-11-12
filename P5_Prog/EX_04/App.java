package EX_04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputCorrecto = false;

        while (!inputCorrecto) {
            try {
                System.out.print("Introduce un número entero: ");
                int numero = scanner.nextInt();

                int cuadrado = numero * numero;
                System.out.println("El cuadrado de " + numero + " es: " + cuadrado);

                inputCorrecto = true;

            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un número entero.");
                scanner.nextLine();
            }
        }
    }
}
