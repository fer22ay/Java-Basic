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

    public void encender() {
        System.out.println("Encender!!");
    }

    public void acelearar() {
        System.out.println("Velocimetro 80km");
    }

    public void frenar() {
        System.out.println("Velocimetro 0km");
    }

}
