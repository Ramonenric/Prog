package EX_05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();

            int resultado = 10 / numero;

            System.out.println("El resultado de dividir 10 por " + numero + " es: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar un número entero.");

        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }
    }
}
