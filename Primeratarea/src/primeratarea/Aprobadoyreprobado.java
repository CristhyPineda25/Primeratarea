/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primeratarea;

/**
 *
 * Crear un programa que imprima en consola un nombre de estudiante, una
nota y una etiqueta que diga Aprobado o Reprobado, dependiendo del valor
de la nota que tenga
 */
public class Aprobadoyreprobado {
   
    public static void main(String[] args) {
       

        // Supongamos que ya tienes los datos de los estudiantes en arreglos
        String[] nombres = {"Daniel", "Monica", "Luis", "Ana", "Pedro"};
        double[] notas = {65.3, 89, 75, 92, 60};

        // Imprimir encabezado de la tabla
        System.out.println("Nombre\t\tNota\t\tEstado");
        System.out.println("-----------------------------------");

        // Calcular el promedio y etiquetar aprobados o reprobados
        for (int i = 0; i < nombres.length; i++) {
            double nota = notas[i];
            String estado = (nota >= 70) ? "Aprobado" : "Reprobado";
            System.out.printf("%-15s %-15.2f %s%n", nombres[i], nota, estado);
        }

       
    }
}


