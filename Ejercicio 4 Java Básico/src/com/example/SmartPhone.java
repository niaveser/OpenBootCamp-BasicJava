package com.example;

public class SmartPhone extends SmartDevice {

    //Atributos

    String camaraFrontal;
    String memoriaAlmacenamiento;
    String memoriaRAM;
    boolean dobleSIM;
    String pantalla;

    //Constructores

    public SmartPhone() {
    }

    public SmartPhone(String color, String marca, String modelo, String procesador, double pulgadasPantalla, String sistemaOperativo, String camaraFrontal, String memoriaAlmacenamiento, String memoriaRAM, boolean dobleSIM, String pantalla) {
        super(color, marca, modelo, procesador, pulgadasPantalla, sistemaOperativo);
        this.camaraFrontal = camaraFrontal;
        this.memoriaAlmacenamiento = memoriaAlmacenamiento;
        this.memoriaRAM = memoriaRAM;
        this.dobleSIM = dobleSIM;
        this.pantalla = pantalla;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", procesador='" + procesador + '\'' +
                ", pulgadasPantalla=" + pulgadasPantalla +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", camaraFrontal='" + camaraFrontal + '\'' +
                ", memoriaAlmacenamiento='" + memoriaAlmacenamiento + '\'' +
                ", memoriaRAM='" + memoriaRAM + '\'' +
                ", dobleSIM=" + dobleSIM +
                ", pantalla='" + pantalla + '\'' +
                '}';
    }
}
