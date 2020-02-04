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

    public Auto() {

    }

    public Auto(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void meterLlave(String clave) {
        if (clave.equals("123456")) {
            acceso = true;
        } else {
            acceso = false;
            System.out.println("Llamar a emergencia");
        }
    }

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

    public void acelearar() {
        System.out.println("Velocimetro 80km");
    }

    public void frenar() {
        System.out.println("Velocimetro 0km");
    }

}
