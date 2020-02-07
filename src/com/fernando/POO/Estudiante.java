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

    /**
     * Metodo constructor de la clase Estudiante, tambien hereda los atributos
     * de la clase padre Persona.
     *
     * @param nombre tipo String
     * @param apellido tipo String
     * @param edad tipo Integer
     * @param codigoEstudiante tipo String
     * @param calificacion tipo float
     */
    public Estudiante(String nombre, String apellido, int edad, String codigoEstudiante, float calificacion) {
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.calificacion = calificacion;
    }

    /**
     * Metodo getter para obtener y mostrar el codigo del Estudiante
     *
     * @return codigoEstudiante tipo String
     */
    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    /**
     * Metodo setter para agregar el codigo del Estudiante
     *
     * @param codigoEstudiante tipo String
     */
    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    /**
     * Metodo getter para obtener y mostrar la calificacion del Estudiante.
     *
     * @return calificacion tipo Float
     */
    public float getCalificacion() {
        return calificacion;
    }

    /**
     * Metodo setter para agregar la calificacion del Estudiante
     *
     * @param calificacion tipo Float
     */
    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * Metodo publico para mostrar el nombre del Estudiante.
     */
    public void muestraNombre() {
        System.out.println("Nombre : " + this.getNombre());
    }

    /**
     * Metodo publico para acceder al apellido del Estudiante.
     */
    public void muestraApellido() {
        System.out.println("Apellido : " + this.getApellido());
    }

    /**
     * Metodo publico para acceder a la edad del Estudiante.
     */
    public void muestraEdad() {
        System.out.println("Edad : " + this.getEdad());
    }
}
