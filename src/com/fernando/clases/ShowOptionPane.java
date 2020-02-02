package com.fernando.clases;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando Ambrosio
 */
public class ShowOptionPane {
    
    public static void main(String [] args){
        String cadena = JOptionPane.showInputDialog("Mete una cadena");
        JOptionPane.showMessageDialog(null, "Esta es tu cadena " + cadena);
        
        Scanner sc = new Scanner(System.in);
        int valor;
        System.out.println("Add to number");
        valor = sc.nextInt();
        System.out.println("To number is : " + valor);
    }
    
}
