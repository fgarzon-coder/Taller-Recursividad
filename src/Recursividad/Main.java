package Recursividad;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = leerOpcion(sc);

            System.out.println();
            try {
                switch (opcion) {
                    case 1:  Ejercicio01.ejecutar(sc); break;
                    case 2:  Ejercicio02.ejecutar(sc); break;
                    case 3:  Ejercicio03.ejecutar(sc); break;
                    case 4:  Ejercicio04.ejecutar(sc); break;
                    case 5:  Ejercicio05.ejecutar(sc); break;
                    case 6:  Ejercicio06.ejecutar(sc); break;
                    case 7:  Ejercicio07.ejecutar(sc); break;
                    case 8:  Ejercicio08.ejecutar(sc); break;
                    case 9:  Ejercicio09.ejecutar(sc); break;
                    case 10: Ejercicio10.ejecutar(sc); break;
                    case 11: Ejercicio11.ejecutar(sc); break;
                    case 12: Ejercicio12.ejecutar(sc); break;
                    case 13: Ejercicio13.ejecutar(sc); break;
                    case 14: Ejercicio14.ejecutar(sc); break;
                    case 0:  System.out.println("¡Hasta luego!"); break;
                    default: System.out.println("Opción no valida.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada no valida: debe ingresar un numero.");
                sc.nextLine();   // descarta la entrada incorrecta
            }
        } while (opcion != 0);

        sc.close();
    }


    private static int leerOpcion(Scanner sc) {
        String linea = "";
        while (linea.isEmpty() && sc.hasNextLine()) {
            linea = sc.nextLine().trim();
        }
        if (linea.isEmpty()) {
            return 0;   // fin de la entrada: salir
        }
        try {
            return Integer.parseInt(linea);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static void mostrarMenu() {
        System.out.println("\n===== TALLER DE RECURSIVIDAD =====");
        System.out.println(" 1. Factorial");
        System.out.println(" 2. Invertir un numero");
        System.out.println(" 3. Sumatoria 1 + 1/2 + ... + 1/n");
        System.out.println(" 4. Suma de los dígitos");
        System.out.println(" 5. Sumatoria hasta n");
        System.out.println(" 6. Potencia");
        System.out.println(" 7. M.C.D. (Euclides)");
        System.out.println(" 8. Copiar una cadena");
        System.out.println(" 9. Cociente (restas sucesivas)");
        System.out.println("10. Multiplicación (sumas sucesivas)");
        System.out.println("11. Suma de un arreglo");
        System.out.println("12. Suma de una matriz m x n");
        System.out.println("13. Serie de Fibonacci");
        System.out.println("14. Función de Ackermann");
        System.out.println(" 0. Salir");
        System.out.print("Seleccione una opción: ");
    }
}
