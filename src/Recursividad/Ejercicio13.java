package Recursividad;

import java.util.Scanner;

/**
 * Ejercicio 13: Serie de Fibonacci.
 *   Fib(0) = 0 ; Fib(1) = 1 ; Fib(n) = Fib(n-1) + Fib(n-2) si n >= 2
 * Se imprimen los terminos de la serie hasta el valor límite.
 */
public class Ejercicio13 {

    public static long fibonacci(int n) {
        if (n == 0) {
            return 0;                                   // caso base
        }
        if (n == 1) {
            return 1;                                   // caso base
        }
        return fibonacci(n - 1) + fibonacci(n - 2);     // caso recursivo
    }

    /** Imprime los términos Fib(i), Fib(i+1), ... mientras no superen el límite. */
    public static void imprimirSerie(int i, long limite) {
        long valor = fibonacci(i);
        if (valor > limite) {
            return;                                     // caso base
        }
        System.out.print(valor + " ");
        imprimirSerie(i + 1, limite);                   // caso recursivo
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese el valor limite de la serie: ");
        long limite = sc.nextLong();
        if (limite < 0) {
            System.out.println("El limite debe ser mayor o igual a 0.");
            return;
        }
        System.out.print("Serie de Fibonacci hasta " + limite + ": ");
        imprimirSerie(0, limite);
        System.out.println();
    }
}
