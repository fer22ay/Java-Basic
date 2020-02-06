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

    public Alumnos() {
    }

    public Alumnos(String nombre, char aula) {
        this.nombre = nombre;
        this.aula = aula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getAula() {
        return aula;
    }

    public void setAula(char aula) {
        this.aula = aula;
    }

    public float getCalificacion() {
        return calificacion;
    }

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
