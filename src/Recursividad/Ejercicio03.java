package Recursividad;

import java.util.Scanner;

/**
 * Ejercicio 3: Leer un valor entero n y calcular 1 + 1/2 + 1/3 + ... + 1/n
 */
public class Ejercicio03 {

    public static double sumatoriaArmonica(int n) {
        if (n <= 0) {
            return 0;                                  // caso base
        }
        return 1.0 / n + sumatoriaArmonica(n - 1);     // caso recursivo
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese un numero entero positivo n: ");
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("n debe ser mayor o igual a 1.");
            return;
        }
        System.out.println("1 + 1/2 + ... + 1/" + n + " = " + sumatoriaArmonica(n));
    }
}
