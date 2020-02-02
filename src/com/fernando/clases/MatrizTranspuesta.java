package com.fernando.clases;

import java.util.Scanner;

/**
 *
 * @author Fernando Ambrosio
 * @version v0.1.0
 * @since 2020
 */
public class MatrizTranspuesta {

    /**
     * *
     * Clase para combertir una matriz a una matriz transpuesta El usuario debe
     * ingresar los datos de una matriz 3x3 1 2 3 4 5 6 7 8 9
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int matriz[][] = new int[3][3];
        int matrizT[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresa los datos de la fila " + (i + 1));
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizT[j][i] = matriz[i][j];
            }
        }

        System.out.println("Aqui esta la matriz transpuesta");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizT[i][j] + "\t");
            }
            System.out.println("");
        }

    }

}
