/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primeratarea;

/**
 *
 * Crear un arreglo multidimensional que guarde más datos personales tus
compañeros de clase (nombre, apellido, carrera, lugarTrabajo), tomando
como referencia de la información colocada en el foro Conociendonos. Llenar
5 registros
 */
public class CompañerosDeClases {
       public static void main(String[] args) {
        // Declaración del arreglo bidimensional
        String[][] compañeros = new String[5][4];

        // Llenar el arreglo con datos
        compañeros[0] = new String[]{"JACKELINE" ,"CABRERA", "Ingeniería Informática", "Banco Davivienda"};
        compañeros[1] = new String[]{"ROBERTO","QUINTERO", "Marketing","ferreteria "};
        compañeros[2] = new String[]{"ENOC", "PEREZ"     ,      "Ingenieria industrial", "Estudiante"};
        compañeros[3] = new String[]{"JOSUE", "JOSUE ZAMORA", "Derecho", "Cafeteria"};
        compañeros[4] = new String[]{"DANILO", "GUARDADO ", "Ingenieria en computacion", "Banco ficosa"};

   
        for (String[] compañero : compañeros) {
            System.out.printf("| %-8s | %-10s | %-25s | %-20s |\n", compañero[0], compañero[1], compañero[2], compañero[3]);
        }
    }

}
 

