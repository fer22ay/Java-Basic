package com.fernando.clases;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Clase para calcular la fecha de nacimiento de una persona
 *
 * @author Fernando Ambrosio
 * @version v0.1.0
 * @since 2020
 */
public class CalcularEdad {

    public static void main(String[] args) {

        Calendar fechaNac = new GregorianCalendar(1995, 01, 10);
        Calendar fechaHoy = Calendar.getInstance();
        int yearNac = fechaNac.get(Calendar.YEAR);
        int yearToday = fechaHoy.get(Calendar.YEAR);
        int edad = yearToday - yearNac;
        System.out.println("You age is : " + edad);

    }

}
