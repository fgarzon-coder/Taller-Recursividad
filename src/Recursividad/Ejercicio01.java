package Recursividad;

import java.util.Scanner;

/**
 * Ejercicio 1: Leer un numero entero n y calcular su factorial.
 */
public class Ejercicio01 {

    public static long factorial(int n) {
        if (n <= 1) {
            return 1;                    // caso base
        }
        return n * factorial(n - 1);     // caso recursivo
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese un numero entero (0 a 20): ");
        int n = sc.nextInt();
        if (n < 0 || n > 20) {
            System.out.println("El factorial solo esta definido para 0 <= n <= 20 (limite de tipo long).");
            return;
        }
        System.out.println(n + "! = " + factorial(n));
    }
}
