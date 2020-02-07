package com.fernando.sobreEscritura;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Clase Listas introduccion a las listas dinamica, ArrayList
 *
 * @author Fernando Ambrosio
 * @version v0.1.0
 * @since 06 de febrero 2020
 */
public class Listas {

    /**
     * *
     * Metodo listaDinamica ejemplo de la utilizacion del ArrayList. El usuario
     * va ingresando los valores que desea, luego el programa le pregunta si
     * desea seguir ingresando datos, lo cual debe responder a un 's' o 'n' para
     * cancelar
     */
    public void listaDinamica() {

        ArrayList<String> lista = new ArrayList<>();
        char respuesta;
        do {
            lista.add(JOptionPane.showInputDialog("Ingresa el valor"));
            respuesta = JOptionPane.showInputDialog("Quieres seguir ingresando valores S/N").charAt(0);
        } while (respuesta == 's' || respuesta == 'S');
        System.out.println("Resultado de la lista dinamica");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

    }

}
