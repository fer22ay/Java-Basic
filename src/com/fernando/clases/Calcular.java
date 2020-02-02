package com.fernando.clases;

import java.util.Scanner;

/**
 *
 * @author Fernando Ambrosio
 * @version v0.1.0
 * @since 2020
 */
public class Calcular {
    
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Add to value of product one");
        float product1 = sc.nextFloat();
        System.out.println("Add to value of product two");
        float product2 = sc.nextFloat();
        System.out.println("Add to value of product tree");
        float product3 = sc.nextFloat();
        float suma = product1 + product2 + product3;
        System.out.println("Suma total " + suma);
        
        double totalMasRedondeo = Math.ceil(suma);
        System.out.println("Total pagadoo : " + totalMasRedondeo);
        double redondeo = totalMasRedondeo - suma;
        System.out.println("Gracias por redondear : " + redondeo);
        
    }
    
}
