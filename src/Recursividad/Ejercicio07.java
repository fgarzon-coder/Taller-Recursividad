package Recursividad;

import java.util.Scanner;

/**
 * Ejercicio 7: M.C.D. de dos enteros con el algoritmo de Euclides.
 *   MCD(M, N) = M                 si N = 0
 *   MCD(M, N) = MCD(N, M % N)     si N != 0
 */
public class Ejercicio07 {

    public static int mcd(int m, int n) {
        if (n == 0) {
            return m;                   // caso base
        }
        return mcd(n, m % n);           // caso recursivo
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese el primer número (M): ");
        int m = Math.abs(sc.nextInt());
        System.out.print("Ingrese el segundo número (N): ");
        int n = Math.abs(sc.nextInt());
        if (m < n) {                    // aseguramos M >= N
            int aux = m;
            m = n;
            n = aux;
        }
        System.out.println("M.C.D. = " + mcd(m, n));
    }
}
