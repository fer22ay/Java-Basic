package com.fernando.POO;

/**
 * Clase Alumnos se encuentran los datos del alumno
 *
 * @author Fernando Ambrosio
 * @version v0.1.0
 * @since 2020
 */
public class Alumnos {

    private String nombre;
    private char aula;
    private float calificacion;

    /**
     * Metodo constructor vacío de la clase Alumnos
     */
    public Alumnos() {
    }

    /**
     * Sobrecarga de constructor de la clase Alumnos
     *
     * @param nombre tipo String, se guarda el nombre del alumno
     * @param aula tipo char, se guarda la aula del Alumno
     */
    public Alumnos(String nombre, char aula) {
        this.nombre = nombre;
        this.aula = aula;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public char getAula() {
        return aula;
    }

    /**
     *
     * @param aula
     */
    public void setAula(char aula) {
        this.aula = aula;
    }

    /**
     *
     * @return
     */
    public float getCalificacion() {
        return calificacion;
    }

    /**
     * Metodo setter para validar la calificación del Alumno
     *
     * @param calificacion tipo float, se almacena la calificación del alumno.
     */
    public void setCalificacion(float calificacion) {
        if (calificacion > 10) {
            this.calificacion = 10;
        } else if (calificacion < 0) {
            this.calificacion = 0;
        } else {
            this.calificacion = calificacion;
        }
    }

}
