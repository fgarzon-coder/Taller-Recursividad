package Recursividad;

import java.util.Scanner;

/**
 * Ejercicio 11: Leer n valores, guardarlos en un arreglo y sumar sus elementos.
 */
public class Ejercicio11 {

    public static int sumaArreglo(int[] arreglo, int i) {
        if (i >= arreglo.length) {
            return 0;                                   // caso base
        }
        return arreglo[i] + sumaArreglo(arreglo, i + 1); // caso recursivo
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("¿Cuantos valores desea ingresar?: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("La cantidad debe ser mayor que cero.");
            return;
        }
        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            arreglo[i] = sc.nextInt();
        }
        System.out.println("Suma de los elementos: " + sumaArreglo(arreglo, 0));
    }
}
