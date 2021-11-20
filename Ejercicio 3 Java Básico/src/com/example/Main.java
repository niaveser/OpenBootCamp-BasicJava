package com.example;

public class Main {
    public static void main(String[] args) {

        String[] texto = {"tres", "tristes", "tigres", "comen", "trigo", "en", "un", "trigal"};

        //Bucle for recorre el array texto para concatenar las palabras que contiene
        for (int i = 0; i < texto.length; i++){

            if (i == 0){
                //Convierte la primera letra de la primera palabra del array en mayúscula y la imprime seguida de espacio
                String primeraPalabra = texto[i].substring(0, 1).toUpperCase() + texto[i].substring(1);
                System.out.print(primeraPalabra + " ");
            }
            else if (i <= texto.length -2) {
                //Imprime las siguientes palabras, hasta la penúltima, seguidas de espacio
                System.out.print(texto[i] + " ");
            }else{
                //Imprime la última palabra seguida de punto final
                System.out.println(texto[i] + ".");
            }
        }

    }
}
