package com.fernando.clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Fernando Ambrosio
 * @version v0.1.0
 * @since 2020
 */
public class Palindromo {
    /***
     * Palindromo es una palabra o frase que se lee igual en un sentido que en otro.
     * Por ejemplo "Ojo", "Area"
     * @param args tipo texto
     */
    public static void main(String [] args){
        
        String text = JOptionPane.showInputDialog("Write to palindromo");
        int longitud = text.length();
        char [] letras = new char[longitud];
        char [] letrasInv = new char[longitud];
        int inverso = longitud;
        boolean igual = true;
        for (int i = 0; i < longitud; i++) {
            letrasInv[i] = text.toLowerCase().charAt(inverso-1);
            inverso--;
            letras[i] = text.toLowerCase().charAt(i);
            if (letrasInv[i] != letras[i]) {
                igual= false;
                break;
            }
        }
        if (igual == false) {
            System.out.println("You text not is palindromo " + text);
        }else{
            System.out.println("Good add to text " + text);
        }
        
    }
    
}
