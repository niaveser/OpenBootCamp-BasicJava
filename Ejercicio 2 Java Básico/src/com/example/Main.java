package com.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static final double IVA_GENERAL = 1.21;

    /*
    Crear una código que te pida introducir un precio y que mediante una función
    te devuelva el precio con IVA incluido
     */

    public static void main(String[] args) {
        //Locale.setDefault(new Locale ("es", "ES"));

        Scanner sc = new Scanner(System.in);//.useLocale(Locale.ES);

        //Te pide introducir el precio
        System.out.println("Introduzca el precio");
        double precio = sc.nextDouble();

        //Imprime el precio base y con IVA
        System.out.println("Precio sin IVA: " + precio + "\n" + "Precio con IVA: " + getPrecioIva(precio));
    }
    //Calcula el precio con IVA
    public static double getPrecioIva (double precio) {
        double precioIva = precio * IVA_GENERAL;
        return precioIva;


    }
}
