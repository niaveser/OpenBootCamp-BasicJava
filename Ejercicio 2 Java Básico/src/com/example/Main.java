package com.example;

import java.util.Scanner;

public class Main {
    
    /*
    Crear una código que te pida introducir un precio y que mediante una función
    te devuelva el precio con IVA incluido
     */
    private static final double IVA_GENERAL = 1.21;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Te pide introducir el precio
        System.out.println("Introduzca el precio");
        double precio = sc.nextDouble();

        //Imprime el precio base y con IVA
        System.out.println("Precio sin IVA: " + precio + "\n" + "Precio con IVA: " + getPrecioIva(precio));
    }
    //Calcula el precio con IVA
    public static double getPrecioIva (double precio) {
        return precio * IVA_GENERAL;


    }
}
