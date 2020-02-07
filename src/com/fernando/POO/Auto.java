package com.fernando.POO;

/**
 * Clase Auto con sus atributos y metodos necesarios
 *
 * @author Fernando Ambrosio
 * @version v0.1.0
 * @since 2020
 */
public class Auto {

    private String marca;
    private String modelo;
    private String color;
    private boolean acceso = false;

    /**
     * Metodo constructor vació.
     */
    public Auto() {

    }

    /**
     * Sobrecarga de constructor de la clase Auto()
     *
     * @param marca tipo String, se almacena la marca del Auto.
     * @param modelo tipo String, se almacena el modelo del Auto.
     * @param color tipo String, se almacena el color del Auto
     */
    public Auto(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    /**
     * Getter
     *
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Setter
     *
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Getter
     *
     * @return
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Setter
     *
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Getter
     *
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     * Setter
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Metodo para validar la llave del Auto, se valida por medio de un String.
     * Si la llave no es correcta se imprime en consola un mensaje para el
     * usuario.
     *
     * @param clave tipo String
     */
    public void meterLlave(String clave) {
        if (clave.equals("123456")) {
            acceso = true;
        } else {
            acceso = false;
            System.out.println("Llamar a emergencia");
        }
    }

    /**
     * Metodo mando() si la llave es correcta accesso es igual a verdadero. Y
     * se llama al metodo encender()
     *
     * @param accion tipo String
     */
    public void mando(String accion) {
        if (acceso == true) {
            if (accion.equals("enciende")) {
                encender();
            }
        }
    }

    private void encender() {
        System.out.println("Encender!!");
    }

    /**
     * Metodo acelerar() indica la velocidad que tiene el Auto
     */
    public void acelearar() {
        System.out.println("Velocimetro 80km");
    }

    /**
     * Metodo para frenar() el Auto se detiene completamente
     */
    public void frenar() {
        System.out.println("Velocimetro 0km");
    }

}
