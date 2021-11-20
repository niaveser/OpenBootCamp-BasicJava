package com.example;

public class Coche {

    //Atributos
    String color;
    String fabricante;
    String modelo;

    //Constructor
    public Coche() {
    }
    public Coche(String color, String fabricante, String modelo) {
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
