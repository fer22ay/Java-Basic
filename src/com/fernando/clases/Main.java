package com.fernando.clases;

import com.fernando.POO.Alumnos;
import com.fernando.POO.Auto;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Metodo main para realizar la pruebas del curso
 *
 * @author Fernando Ambrosio
 * @version v0.1.0
 * @since 2020
 */
public class Main {

    /**
     * *
     *
     * @param args
     */
    public static void main(String[] args) {

//        Auto auto = new Auto();
//        auto.setModelo("1980");
//        auto.setMarca("Toyota");
//        auto.setColor("Azul");
//
//        auto.meterLlave("1234567");
//        auto.mando("enciende");

        int cantAlumnos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos alumnos tienes"));
        Alumnos a[] = new Alumnos[cantAlumnos];
        for (int i = 0; i < cantAlumnos; i++) {
            a[i] = new Alumnos(JOptionPane.showInputDialog("Ingrese el nombre del alumno: "), 
                    JOptionPane.showInputDialog("Ingresa el aula del alumno").charAt(0));
            a[i].setCalificacion(Float.parseFloat(JOptionPane.showInputDialog("Ingresa la calificacion del alumno : ")));
        }
        float suma = 0;
        float promedio = 0;
        int cantidadAlumnosPorAula = 0;
        char aula = JOptionPane.showInputDialog("Dime de que aula quieres ver y obtener su promedio").charAt(0);
        for (int i = 0; i < cantAlumnos; i++) {
            if (a[i].getAula() == aula) {
                suma = suma+a[i].getCalificacion();
                cantidadAlumnosPorAula++;
            }
        }
        promedio = suma/cantidadAlumnosPorAula;
        JOptionPane.showMessageDialog(null, promedio);
    }

}
