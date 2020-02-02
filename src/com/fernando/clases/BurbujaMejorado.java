package com.fernando.clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Fernando Ambrosio
 * @version v0.1.0
 * @since 2020
 */
public class BurbujaMejorado {

    /**
     * *
     * Program mejorado de ordenamiento, al ingresar una lista de numeros
     * separados por como el programa los ordena de manera ascendente y
     * descendente.
     *
     * @param args arreglo de tipo String
     */
    public static void main(String[] args) {

        String text = JOptionPane.showInputDialog("Add to number separado by comas");
        String numberInText[] = text.split(",");
        //cantidad = quantity
        int quantity = numberInText.length;
        int numbers[] = new int[quantity], temp, bandera = 1, ciclos = 0;
        for (int i = 0; i < quantity; i++) {
            numbers[i] = Integer.parseInt(numberInText[i]);
        }
        for (int i = 0; i < (quantity - 1) && bandera == 1; i++) {
            bandera = 0;
            for (int j = 0; j < (quantity - 1); j++) {
                if (numbers[j] > numbers[j + 1]) {
                    bandera = 1;
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
            ciclos++;
        }

        System.out.println("User here you go to numbers order by to form ascendente " + ciclos);
        for (int i = 0; i < quantity; i++) {
            System.out.print(numbers[i] + ",");
        }
        System.out.println("\nUser here you go to numbers order by to form descendente " + ciclos);
        for (int i = quantity - 1; i >= 0; i--) {
            System.out.print(numbers[i] + ",");
        }
    }

}
