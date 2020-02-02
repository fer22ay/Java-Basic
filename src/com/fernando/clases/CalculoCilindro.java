package com.fernando.clases;

import java.util.Scanner;

/**
 * Porgrama para calcular el volumne de un cilindro.
 * @author Fernando Ambrosio
 * @version v0.1.0
 * @since 2020
 */
public class CalculoCilindro {
    
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Diametro del vaso = ");
        float diametro = sc.nextFloat();
        System.out.print("Altura del vaso = ");
        float altura = sc.nextFloat();
        double volumen;
        final float pi = 3.1415f;
        float radio = diametro/2;
        
        volumen = pi*Math.pow(radio, 2)*altura;
        
        System.out.println("Volumne de un baso de cerveza es : " + volumen);
        System.out.print("Con cuantos litros te emborrachas ? ");
        float litros = sc.nextFloat();
        float mililitros = litros*1000;
        
        double limiteVasos = mililitros/volumen;
        System.out.println("Yo me emborracho con : " + limiteVasos + " Vasos de cerveza");
    }
    
}
