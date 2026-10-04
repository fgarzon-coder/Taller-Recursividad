package Recursividad;

import java.util.Scanner;

/**
 * Ejercicio 5: Calcular la sumatoria 1 + 2 + ... + n hasta el numero leido.
 */
public class Ejercicio05 {

    public static long sumatoria(int n) {
        if (n <= 0) {
            return 0;                       // caso base
        }
        return n + sumatoria(n - 1);        // caso recursivo
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese un numero entero positivo: ");
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("El numero debe ser mayor o igual a 1.");
            return;
        }
        System.out.println("Sumatoria de 1 hasta " + n + " = " + sumatoria(n));
    }
}
