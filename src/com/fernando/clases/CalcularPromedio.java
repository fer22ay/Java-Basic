package com.fernando.clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Fernando Ambrosio
 * @version v0.1.0
 * @since 2020
 */
public class CalcularPromedio {
    
    /***
     * Clase para calcular el promedio de cuatro notas ingresadas por el usuario
     * @param args tipo entero.
     */
    public static void main(String [] args){
        
        String text;
        float calificaciones[] = new float[4], suma=0, promedio = 0;
        int semestres = 0;
        do {            
            text = JOptionPane.showInputDialog("Add to califiacion del semestre" + (semestres + 1));
            if (text == null) {
                break;
            }
            calificaciones[semestres] = Float.parseFloat(text);
            semestres++;
        } while (semestres<4);
        
        for(float calificacion : calificaciones){
            suma += calificacion;
        }
        
        promedio = suma/semestres;
        JOptionPane.showMessageDialog(null, promedio);
        
    }
    
}
