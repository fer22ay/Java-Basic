package com.fernando.clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Fernando Ambrosio
 * @version v0.1.0
 * @since 2020
 */
public class Ordenamiento {

    /**
     * *
     * Metodo para ordenar una lista de numeros separados por comas y ordenarlos
     * de forma ascendente y descendente mejorado.
     *
     * @param args devuelve un arreglo de numeros.
     */
    public static void main(String[] args) {

        String text = JOptionPane.showInputDialog("Add to number separados by comas");
        String numberInText[] = text.split(",");
        int cantidad = numberInText.length;
        int numbers[] = new int[cantidad], temp;
        for (int i = 0; i < cantidad; i++) {
            numbers[i] = Integer.parseInt(numberInText[i]);
        }

        for (int i = 0; i < (cantidad - 1); i++) {
            for (int j = 0; j < (cantidad - 1); j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println("User here you go to numbers order by of form ascendente");
        for (int i = 0; i < cantidad; i++) {
            System.out.print(numbers[i] + " , ");
        }
        System.out.println("\nUser here you go to numbers order by of form descendente");
        for (int i = cantidad - 1; i >= 0; i--) {
            System.out.print(numbers[i] + ",");
        }

    }

}
