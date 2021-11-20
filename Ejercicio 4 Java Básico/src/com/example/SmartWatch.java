package com.example;

public class SmartWatch extends SmartDevice {

    //Atributos

    boolean sumergible;
    boolean wifi;
    boolean bluetooth;
    String autonomia;

    //Constructores

    public SmartWatch(){
    }

    public SmartWatch(String color, String marca, String modelo, String procesador, double pulgadasPantalla, String sistemaOperativo, boolean sumergible, boolean wifi, boolean bluetooth, String autonomia) {
        super(color, marca, modelo, procesador, pulgadasPantalla, sistemaOperativo);
        this.sumergible = sumergible;
        this.wifi = wifi;
        this.bluetooth = bluetooth;
        this.autonomia = autonomia;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", procesador='" + procesador + '\'' +
                ", pulgadasPantalla=" + pulgadasPantalla +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", sumergible=" + sumergible +
                ", wifi=" + wifi +
                ", bluetooth=" + bluetooth +
                ", autonomia='" + autonomia + '\'' +
                '}';
    }
}
