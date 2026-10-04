package Recursividad;

import java.util.Scanner;

/**
 * Ejercicio 4: Sumar los digitos de un numero. Ej: 123 -> 6
 */
public class Ejercicio04 {

    public static int sumaDigitos(long n) {
        if (n == 0) {
            return 0;                                  // caso base
        }
        return (int) (n % 10) + sumaDigitos(n / 10);   // caso recursivo
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese un numero entero: ");
        long n = sc.nextLong();
        System.out.println("Suma de los digitos: " + sumaDigitos(Math.abs(n)));
    }
}
