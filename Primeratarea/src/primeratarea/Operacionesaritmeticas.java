/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primeratarea;

/**
 *
 Crear un programa que imprima en consola todas las operaciones aritméticas
de dos números enteros (suma, resta, multiplicación, divición, mod)
 */
public class Operacionesaritmeticas {
    public static void main(String[] args) {
        int numero1 = 25;
        int numero2 = 10;

        // Suma
        int suma = numero1 + numero2;
        System.out.println("Suma: " + suma);

        // Resta
        int resta = numero1 - numero2;
        System.out.println("Resta: " + resta);

        // Multiplicación
        int multiplicacion = numero1 * numero2;
        System.out.println("Multiplicación: " + multiplicacion);

        // División
        double division = (double) numero1 / numero2;
        System.out.println("División: " + division);

        // Módulo
        int modulo = numero1 % numero2;
        System.out.println("Módulo: " + modulo);
    }
}

