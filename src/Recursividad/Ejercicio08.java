package Recursividad;

import java.util.Scanner;

/**
 * Ejercicio 8: Copiar una cadena en otra.
 */
public class Ejercicio08 {

    /** Copia el caracter en la posición i y continúa con i + 1. */
    public static void copiar(char[] origen, char[] destino, int i) {
        if (i >= origen.length) {
            return;                             // caso base
        }
        destino[i] = origen[i];
        copiar(origen, destino, i + 1);         // caso recursivo
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese una cadena: ");
        String texto = sc.nextLine();
        char[] origen = texto.toCharArray();
        char[] destino = new char[origen.length];
        copiar(origen, destino, 0);
        System.out.println("Cadena copiada: " + new String(destino));
    }
}
