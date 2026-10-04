package Recursividad;

import java.util.Scanner;

/**
 * Ejercicio 12: Crear una matriz m x n y sumar todos sus elementos.
 */
public class Ejercicio12 {

    public static int sumaMatriz(int[][] matriz, int fila, int col) {
        if (fila >= matriz.length) {
            return 0;                                           // caso base: no quedan filas
        }
        if (col >= matriz[fila].length) {
            return sumaMatriz(matriz, fila + 1, 0);             // pasar a la siguiente fila
        }
        return matriz[fila][col] + sumaMatriz(matriz, fila, col + 1);
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Numero de filas (m): ");
        int m = sc.nextInt();
        System.out.print("Numero de columnas (n): ");
        int n = sc.nextInt();
        if (m <= 0 || n <= 0) {
            System.out.println("Las dimensiones deben ser mayores que cero.");
            return;
        }
        int[][] matriz = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Suma de los elementos de la matriz: " + sumaMatriz(matriz, 0, 0));
    }
}
