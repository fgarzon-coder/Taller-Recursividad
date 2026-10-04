package Recursividad;

import java.util.Scanner;

/**
 * Ejercicio 2: Leer un numero entero e invertirlo. Ej: 123 -> 321
 */
public class Ejercicio02 {

    public static long invertir(long n, long acumulado) {
        if (n == 0) {
            return acumulado;                                    // caso base
        }
        return invertir(n / 10, acumulado * 10 + n % 10);        // caso recursivo
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese un numero entero: ");
        long n = sc.nextLong();
        long resultado = invertir(Math.abs(n), 0);
        if (n < 0) {
            resultado = -resultado;
        }
        System.out.println("Numero invertido: " + resultado);
    }
}
