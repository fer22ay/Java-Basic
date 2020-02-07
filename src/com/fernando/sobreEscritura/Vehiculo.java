package com.fernando.sobreEscritura;

/**
 * Esta es la clase Padre abstracta
 *
 * @author Fernando Ambrosio
 * @version v0.1.0
 * @since 2020
 */
public class Vehiculo {

    private String matricula;
    private String marca;
    private String modelo;

    /**
     * Constructor vacío de la clase Vehiculo
     */
    public Vehiculo() {
    }

    /**
     * Getter para obtener la matricula del Vehiculo
     *
     * @return matricula tipo String
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Setter para enviar la matricula
     *
     * @param matricula tipo String
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Getter para obtener la marca del Vehiculo
     *
     * @return marca de tipo String
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Setter para enviar la marca del Vehiculo
     *
     * @param marca tipo String
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Getter para obtener el modelo del Vehiculo
     *
     * @return modelo tipo String
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Setter para enviar el modelo del Vehiculo
     *
     * @param modelo tipo String
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
