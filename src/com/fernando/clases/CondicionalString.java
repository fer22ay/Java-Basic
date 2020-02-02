package com.fernando.clases;

import java.util.Scanner;

/**
 *
 * @author Fernando Ambrosio
 */
public class CondicionalString {
    
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
//        System.out.println("Write to option:\nAccess\nConfiguration\nHelp");
//        String select = sc.nextLine();
//        switch(select){
//            case "access":
//                System.out.println("Selection the acess");
//                break;
//            case "configuration":
//                System.out.println("Selection the configuration");
//                break;
//            case "help":
//                System.out.println("Selection to help");
//                break;
//            default:
//                System.out.println("Option not valid");
//                break;
//        }
        
        System.out.println("Saludame please");
        String response = sc.nextLine();
        response = response.toLowerCase();
        if (response.equals("hola")) {
            System.out.println("Como estas");
        }else{
            System.out.println("No te entiendo");
        }
        
    }
    
}
