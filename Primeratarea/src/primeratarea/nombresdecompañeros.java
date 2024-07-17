/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primeratarea;

/**
 *
 * Crear un arrelo que guarde e imprima 10 nombres de tus compañeros de la
clase
 */
public class nombresdecompañeros {
 public static void main(String[] args) {
        // Declarar un arreglo de cadenas (nombres)
        String[] nombres = new String[10];

        // Asignar valores a los elementos del arreglo
        nombres[0] = "DUNIA JACKELINE CABRERA BEJARANO";
        nombres[1] = "CARLOS ROBERTO QUINTERO CHICAS";
        nombres[2] = "DARLING JHANUARIO CABRERA TINOCO";
        nombres[3] = "DAVID ENOC PEREZ SALGUERO";
        nombres[4] = "ALEJANDRA DELATTIBODIER GARCIA";
        nombres[5] = "WILSON RICARDO FLORES JUAREZ";
        nombres[6] = "DAMIAN DANILO FUNEZ REYES";
        nombres[7] = "EVER DANILO GUARDADO DIAZ";
        nombres[8] = "YAJAIRA MICHEL ENAMORADO TORRES";
        nombres[9] = "JEFERSSON JOSUE ZAMORA GARCIA";

        // Imprimir los nombres almacenados en el arreglo
        System.out.println("Nombres de mis compañeros:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
