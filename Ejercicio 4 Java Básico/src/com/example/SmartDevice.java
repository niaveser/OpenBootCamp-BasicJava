package com.example;

public abstract class SmartDevice {

    //Atributos
    String color;
    String marca;
    String modelo;
    String procesador;
    double pulgadasPantalla;
    String sistemaOperativo;


    //Constructores

    public SmartDevice(){
    }

    public SmartDevice(String color, String marca, String modelo, String procesador, double pulgadasPantalla, String sistemaOperativo) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.pulgadasPantalla = pulgadasPantalla;
        this.sistemaOperativo = sistemaOperativo;
    }
    //Metodos


    @Override
    public String toString() {
        return "SmartDevice{" +
                "color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", procesador='" + procesador + '\'' +
                ", pulgadasPantalla=" + pulgadasPantalla +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                '}';
    }
}
