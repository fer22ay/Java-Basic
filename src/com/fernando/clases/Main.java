package com.fernando.clases;

import com.fernando.POO.Auto;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

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

        Auto auto = new Auto();
        auto.setModelo("1980");
        auto.setMarca("Toyota");
        auto.setColor("Azul");
        
        auto.meterLlave("1234567");
        auto.mando("enciende");

    }

}
