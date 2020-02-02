package com.fernando.clases;

import java.util.Scanner;

/**
 *
 * @author Fernando Ambrosio
 * @version v0.1.0
 * @since 2020
 */
public class MatrizWithString {

    public static void main(String[] args) {

        /*
        Copiar y pegar en la terminal:
        Maria   Ramirez C
        Juan    Perez   B
        Ines    Montes  B
        Rene    Pacheco B
        Elena   Morales A
        Mario   Diaz    C
        Sonia   Navarro A
         */
        String alumnos[][] = new String[7][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < alumnos.length; i++) {
            //Ingresa los datos del alumno
            System.out.println("Enter student data" + (i + 1));
            for (int j = 0; j < 3; j++) {
                alumnos[i][j] = sc.next();
            }
        }

        System.out.println("Dime de que aula quieres ver tus alumnos?");
        /*sc.next() lee el texto y cuando encuentra un espacio termina de
          leer el texto. A diferencia de sc.nextLine() que lee los espacios
          esto forza al programa a mostrar todo el texto ingresado.
        */
        String aula = sc.next();
        aula = aula.toLowerCase();
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i][2].toLowerCase().equals(aula)) {
                System.out.println("");
                for (int j = 0; j < 3; j++) {
                    System.out.print(alumnos[i][j] + " ");
                }
            }
        }

    }

}
