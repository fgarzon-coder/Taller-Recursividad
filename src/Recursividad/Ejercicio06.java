package Recursividad;

import java.util.Scanner;

/**
 * Ejercicio 6: Calcular la potencia base^exponente.
 */
public class Ejercicio06 {

    public static double potencia(double base, int exponente) {
        if (exponente == 0) {
            return 1;                                         // caso base
        }
        if (exponente < 0) {
            return 1.0 / potencia(base, -exponente);          // exponente negativo
        }
        return base * potencia(base, exponente - 1);          // caso recursivo
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese la base: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese el exponente (entero): ");
        int exponente = sc.nextInt();
        if (base == 0 && exponente < 0) {
            System.out.println("Indefinido: 0 elevado a un exponente negativo.");
            return;
        }
        System.out.println(base + " ^ " + exponente + " = " + potencia(base, exponente));
    }
}
