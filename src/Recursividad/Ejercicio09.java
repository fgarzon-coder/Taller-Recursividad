package Recursividad;

import java.util.Scanner;

/**
 * Ejercicio 9: Cociente de la division entera usando restas sucesivas.
 */
public class Ejercicio09 {

    /** Cuenta cuántas veces cabe el divisor en el dividendo (ambos positivos). */
    public static int cociente(int dividendo, int divisor) {
        if (dividendo < divisor) {
            return 0;                                       // caso base
        }
        return 1 + cociente(dividendo - divisor, divisor);  // caso recursivo
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese el dividendo: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el divisor: ");
        int b = sc.nextInt();
        if (b == 0) {
            System.out.println("No se puede dividir entre cero.");
            return;
        }
        int resultado = cociente(Math.abs(a), Math.abs(b));
        if ((a < 0) != (b < 0)) {
            resultado = -resultado;
        }
        System.out.println(a + " / " + b + " = " + resultado);
    }
}
