package Recursividad;

import java.util.Scanner;

/**
 * Ejercicio 10: Multiplicar dos enteros mediante sumas sucesivas.
 */
public class Ejercicio10 {

    public static long multiplicar(int a, int b) {
        if (b == 0) {
            return 0;                           // caso base
        }
        if (b < 0) {
            return -multiplicar(a, -b);         // segundo factor negativo
        }
        return a + multiplicar(a, b - 1);       // caso recursivo
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese el primer numero: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int b = sc.nextInt();
        System.out.println(a + " x " + b + " = " + multiplicar(a, b));
    }
}
