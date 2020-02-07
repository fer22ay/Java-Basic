package com.fernando.POO;

/**
 *
 * @author Fernando Ambrosio
 * @version v0.1.0
 * @since 2020
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    /**
     * Metodo constructor vacío.
     */
    public Persona() {

    }

    /**
     * Sobrecarga de constructor
     *
     * @param nombre tipo String, se almacena el nombre de la Persona.
     * @param apellido tipo String, se almacena el apellido de la Persona.
     * @param edad tipo Integer, indica la edad de la Persoan.
     */
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    /**
     * Getter
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter
     *
     * @return
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Setter
     *
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Getter
     *
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Setter
     *
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

}
