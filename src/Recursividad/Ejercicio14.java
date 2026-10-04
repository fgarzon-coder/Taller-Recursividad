package Recursividad;

import java.util.Scanner;

/**
 * Ejercicio 14: Función de Ackermann.
 *   A(m, n) = n + 1                    si m = 0
 *   A(m, n) = A(m - 1, 1)              si m > 0 y n = 0
 *   A(m, n) = A(m - 1, A(m, n - 1))    si m > 0 y n > 0
 */
public class Ejercicio14 {

    public static int ackermann(int m, int n) {
        if (m == 0) {
            return n + 1;
        }
        if (n == 0) {
            return ackermann(m - 1, 1);
        }
        return ackermann(m - 1, ackermann(m, n - 1));
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese m (entero >= 0): ");
        int m = sc.nextInt();
        System.out.print("Ingrese n (entero >= 0): ");
        int n = sc.nextInt();
        if (m < 0 || n < 0) {
            System.out.println("m y n deben ser mayores o iguales a 0.");
            return;
        }
        if (m > 3 && n > 3) {
            System.out.println("Valores muy grandes: la funcion crece demasiado rapido y desbordaría la pila.");
            return;
        }
        try {
            System.out.println("Ackermann(" + m + ", " + n + ") = " + ackermann(m, n));
        } catch (StackOverflowError e) {
            System.out.println("Desbordamiento de pila: use valores más pequeños.");
        }
    }
}
