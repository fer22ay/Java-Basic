package com.fernando.clases;

import javax.swing.JOptionPane;
import javax.swing.plaf.OptionPaneUI;

/**
 *
 * @author Fernando Ambrosio
 * @version v0.1.0
 * @since 2020
 */
public class Arreglos {

    public static void main(String[] args) {

//        int[] listNumbers = {5, 3, 9, 1};
//        for (int i = 0; i < 4; i++) {
//            System.out.println(listNumbers[i]);
//        }
//
//        String text = JOptionPane.showInputDialog("Add to text");
//        int longitud = text.length();
//        char[] caracteres = new char[longitud];
//        int inverso = longitud;
//        for (int i = 0; i < longitud; i++) {
//            caracteres[i] = text.charAt(inverso - 1);
//            inverso--;
//        }
//        System.out.println(caracteres);
        
        
        String [] dogs = {"Firulais","Spaik","Monte","Blocky"};
        for(int i =0; i < dogs.length; i++){
            System.out.println((i+1) + " " + dogs[i]);
        }
        
        System.out.println("----------------------");
        int i = 1;
        for(String dog : dogs){
            System.out.println(i+ " " + dog);
            i++;
        }

    }

}
