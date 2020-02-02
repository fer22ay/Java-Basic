package com.fernando.clases;
import java.util.Scanner;

/**
 *
 * @author Fernando Ambrosio
 * @version v0.1.0
 * @since 2020
 */
public class Matriz {

    /**
     * *
     * Metodo para recorrer una matriz, el usuario ingresa la cantidad de filas
     * que tendra su matriz.Los parametros son de tipo entero.
     *
     * @param args
     */
    public static void main(String[] args) {
        // 5 20 30
        // 8 15 5
        // 54 5 2
//        int matriz[][] = {{5, 20, 30}, {8, 15, 5}, {54, 5, 2}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Human cuantos registros tiene tu matriz : ");
        int filas = sc.nextInt();
        System.out.println("Human cuantas columnas tiene tu matriz: ");
        int columnas = sc.nextInt();
        int matriz[][] = new int[filas][columnas];

        /**
         * *
         * for que recorre el ingreso de datos del usuario y aumenta i para
         * indicar la nueva fila
         */
        for (int i = 0; i < 3; i++) {
            System.out.println("Human add 3 datos de la fila" + (i + 1));
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();

            }
        }
        
        /**
         * *
         * for para mostrar la matriz, ordena por fila el ingreso del usuario
         */
        System.out.println("\nHuman esta es tu matriz: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + ",");
            }
            System.out.println("");
        }

    }

}
