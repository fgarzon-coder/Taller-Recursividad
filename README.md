# Taller de Recursividad - Estructuras de Datos

**Estudiante: Faber Andres Garzon Gomez**

## Descripcion del taller

Este repositorio contiene la solucion del **Taller de Recursividad** de la asignatura *Estructuras de Datos*, desarrollado en **Java**. Cada uno de los 14 ejercicios se resuelve con una funcion recursiva y esta en su propia clase dentro del paquete `Recursividad`. Un menu principal (`Main`) permite ejecutar cualquiera de ellos.

| N.# | Ejercicio | Clase |
|----|-----------|-------|
| 1  | Factorial de un numero | `Ejercicio01` |
| 2  | Invertir un numero entero | `Ejercicio02` |
| 3  | Sumatoria 1 + 1/2 + 1/3 + ... + 1/n | `Ejercicio03` |
| 4  | Suma de los digitos de un numero | `Ejercicio04` |
| 5  | Sumatoria hasta el numero leido | `Ejercicio05` |
| 6  | Potencia (base y exponente) | `Ejercicio06` |
| 7  | M.C.D. con el algoritmo de Euclides | `Ejercicio07` |
| 8  | Copiar una cadena en otra | `Ejercicio08` |
| 9  | Cociente de la division entera (restas sucesivas) | `Ejercicio09` |
| 10 | Multiplicacion (sumas sucesivas) | `Ejercicio10` |
| 11 | Suma de los elementos de un arreglo | `Ejercicio11` |
| 12 | Suma de los elementos de una matriz m x n | `Ejercicio12` |
| 13 | Serie de Fibonacci hasta un limite | `Ejercicio13` |
| 14 | Funcion de Ackermann | `Ejercicio14` |

## Estructura del repositorio

```
Taller-Recursividad/
│
├── src/
│   └── Recursividad/
│       ├── Main.java
│       ├── Ejercicio01.java
│       ├── ...
│       └── Ejercicio14.java
└── README.md
```

## Instrucciones para ejecutar el programa

**Requisito:** tener instalado el JDK 11 o superior (`java -version` y `javac -version` para verificar).

### Opcion 1: Visual Studio Code

1. Instalar la extension **Extension Pack for Java**.
2. Abrir la carpeta `Taller-Recursividad` (*Archivo > Abrir carpeta*).
3. Abrir `src/Recursividad/Main.java` y pulsar **Run** (o `F5`).
4. Elegir en el menu el numero del ejercicio que se quiere probar.

### Opcion 2: Terminal

Desde la carpeta raiz `Taller-Recursividad`:

```bash
# Compilar
javac -d out src/Recursividad/*.java

# Ejecutar
java -cp out Recursividad.Main
```

En Windows (PowerShell) los comandos son los mismos.
