package com.fernando.clases;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando Ambrosio
 * @version v0.1.0
 * @since 2020
 */
public class ArreglosTwo {

    /**
     * *
     * Program what solicita the user numbers separados by comas luego muestra
     * cual es el higher de los que ingreso.
     *
     * @param args recibe cade de texto
     */
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        String nullType = null;
//        String integerType;
//        String characterType;
//
//        System.out.println("Add to text o number");
//        characterType = sc.nextLine();
//        System.out.println(isInteger(characterType));

        String text = JOptionPane.showInputDialog("Add to number separados by coma");
        String numberInText[] = text.split(",");
        int cantidad = numberInText.length;
        int numbers[] = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            numbers[i] = Integer.parseInt(numberInText[i]);
        }
        //mayor = higher
        int higher = 0;
        for (int number : numbers) {
            if (number > higher) {
                higher = number;
            }
        }
        JOptionPane.showMessageDialog(null, "You number mayor is  = " + higher);
    }

    /***
     * Metodo para comparar una cadena ingresada
     * @param source tipo String
     * @return false o true 
     */
    public static boolean isInteger(String source) {
        if (source == null || source.isEmpty()) {
            return false;
        }
        int index = 0;
        while (index < source.length()
                && Character.isDigit(source.charAt(index))) {
            index++;
        }
        return index == source.length();
    }

}
