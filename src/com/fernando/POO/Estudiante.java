package com.fernando.POO;

/**
 * Clase estudiante hereda de la clase padre Persona, hereda todos los atributos
 * de la clase Persona.
 *
 * @author Fernando Ambrosio
 * @version v0.1.0
 * @since 2020
 */
public class Estudiante extends Persona {

    private String codigoEstudiante;
    private float calificacion;

    public Estudiante(String nombre, String apellido, int edad, String codigoEstudiante, float calificacion) {
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.calificacion = calificacion;
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public void muestraNombre() {
        System.out.println("Nombre : " + this.getNombre());
    }

    public void muestraApellido() {
        System.out.println("Apellido : " + this.getApellido());
    }

    public void muestraEdad() {
        System.out.println("Edad : " + this.getEdad());
    }
}