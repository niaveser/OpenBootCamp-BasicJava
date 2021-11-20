package com.example;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        //Escribe el código que devuelva una cadena al revés.
        String mensaje = "hola mundo";

        ArrayList<String> mensajeAlReves = new ArrayList<>();

        for (int i = mensaje.length() - 1; i >= 0; i--){
//                char letra = mensaje.charAt(i);
                mensajeAlReves.add(String.valueOf(mensaje.charAt(i)));
        }
        for (int i= 0; i < mensajeAlReves.size(); i++){
            System.out.print(mensajeAlReves.get(i));
        }

        System.out.println(" ");

        //Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.

        String []arrayColores = {"Rojo", "Azul", "Amarillo"};

        for (String color : arrayColores){
            System.out.println(color);
        }

        //Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.

        int [][]arrayEnteros = {
                {1, 3, 5, 7, 9},
                {2, 4, 6, 8, 0},
        };

        for (int i = 0; i < arrayEnteros.length; i++) {
            for (int j = 0; j < arrayEnteros[i].length; j++){
                System.out.println("Posición: " + i + ", " + j + " Valor: " + arrayEnteros[i][j]);
            }
        }

        //Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
        // Elimina el 2o y 3er elemento y muestra el resultado final.

        Vector<String> vectorDias = new Vector<>();

        vectorDias.add("Lunes");
        vectorDias.add("Martes");
        vectorDias.add("Miércoles");
        vectorDias.add("Jueves");
        vectorDias.add("Viernes");

        vectorDias.remove(1);
        //Repetimos el borrado de la posición 1 porque al haber eliminado la posición 1
        //en la línea de código anterior, el vector que estaba originalmente en la posición 2 pasa a ocupar la posición 1.
        vectorDias.remove(1);

        System.out.println(vectorDias);

        //Problema de utilizar un Vector con la capacidad por defecto
        // si tuviésemos 1000 elementos para ser añadidos al mismo:

        //Si nos pasamos de 1000 elementos la capacidad del vector se duplicará por defecto
        //y pasará a ser de 2000, con lo que el coste computacional de crear la copia será alto.
        //Por eso es mejor hacer estimaciones de la capacidad más cercanas al tamaño que vamos a necesitar.



        //Crea un ArrayList de tipo String, con 4 elementos.
        // Cópialo en una LinkedList.
        // Recorre ambos mostrando únicamente el valor de cada elemento.

        ArrayList<String> listaAnimales = new ArrayList<>();
        listaAnimales.add("Gato");
        listaAnimales.add("Perro");
        listaAnimales.add("Zorro");
        listaAnimales.add("León");

        LinkedList<String> linkedlistAnimales = new LinkedList<>(listaAnimales);

        for (String animal : listaAnimales){
            System.out.println("Elemento de la lista: " + animal);
        }

        for (String animal : linkedlistAnimales){
            System.out.println("Elemento de la LinkedList: " + animal);
        }

        //Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
        // A continuación, con otro bucle, recórrelo y elimina los numeros pares.
        // Por último, vuelve a recorrerlo y muestra el ArrayList final.
        // Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

        ArrayList<Integer> listaNumeros = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            listaNumeros.add(i+1);
        }
        System.out.println(listaNumeros);

        for (int i = 0; i < listaNumeros.size(); i++){
            if (listaNumeros.get(i) % 2 == 0) {
                listaNumeros.remove(i);
            }
        }
        for (Integer numeroImpar : listaNumeros) {
            System.out.println(numeroImpar);
        }

        dividePorCero();
        copiarFichero();

    }

    //Crea una función DividePorCero.
    // Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException
    // que será capturada por su llamante (desde "main", por ejemplo).
    // Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
    // Finalmente, mostraremos en cualquier caso: "Demo de código".

    public static void dividePorCero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos números: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        try {
            int resultado = num1 / num2;
            System.out.println("El resultado de " + num1 + " entre " + num2 + " es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Números no válidos: el segundo número no puede ser 0");
        }
    }

    //Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
    // La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
    public static void copiarFichero (){
        try {
            InputStream fileIn = new FileInputStream("C:\\ejemplo.txt");
            PrintStream fileOut = new PrintStream ("C:\\ejemplo2.txt");
            try{
                byte []datos = fileIn.readAllBytes();
                for (byte dato : datos) {
                    fileOut.print((char)dato);
                }}catch (IOException e) {
                    System.out.println("No puedo leerlo: " + e.getMessage());
                }
            } catch (FileNotFoundException e) {
                System.out.println("No puedo leerlo: " + e.getMessage());
            }

    }
}
