/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primeratarea;

/**
 *
 *  Dadas las variables de tipo int M = 6, T = 1, K = -10 indicar si la evaluación de
estas expresiones daría como resultado verdadero o falso:
M > T
T / K == -5
(M+T == 7) || (M-T == 5)
 */
public class resultadoverdaderoofalso {
    public static void main(String[] args) {
        int M = 6;
        int T = 1;
        int K = -10;

        // Evaluación de las expresiones
        boolean expresion1 = M > T;
        boolean expresion2 = T / K == -5;
        boolean expresion3 = (M + T == 7) || (M - T == 5);

        // Imprimir resultados
        System.out.println("M=6 > T=1 es " + expresion1);
        System.out.println("T=1 / K=-10 == -5 es " + expresion2);
        System.out.println("(M=6 + T=1 == 7) || (M=6 - T=1 == 5) es " + expresion3);
    }
}
   

