package com.fernando.clases;

import java.util.Scanner;

/**
 * Clase para el uso de condicional IF
 * @author Fernando Ambrosio
 */
public class CondicionalIF {
    
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        int numberUser, numberSystem;
        numberSystem = (int)(Math.random()*10);
        System.out.print("Add to number  " + numberSystem + " :");
        numberUser = sc.nextInt();
        
        if (numberUser == numberSystem) {
            System.out.println("Number correct!!");
        }else if(numberUser != numberSystem){
            System.out.println("Number incorrect");
        }
    }
    
}
