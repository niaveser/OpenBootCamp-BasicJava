package com.example;

import java.io.*;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    //Crea un programa de tu elección que utilice InputStream, PrintStream,
    // excepciones, un HashMap y un ArrayList, LinkedList o array.

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        HashMap<String, String> usersMails = new HashMap<>();
        PrintStream fileOut = new PrintStream("C:\\ejemplo3.txt");
        int opcion = 0;

        do {
            System.out.println("Elija una opción:");
            System.out.println("1. Introduzca usuario y mail");
            System.out.println("2. Salir");

            try {
                opcion = sc.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("Introduzca una opción válida");

            }

            //Si se introduce 1, pide usuario y mail, los guarda en el HashMap usersMails e imprime este en un archivo de texto
            //Si se introduce 2, el programa termina

            if (opcion == 1) {

                try {
                    System.out.println("Introduzca su usuario:");
                    Scanner sc1 = new Scanner(System.in);
                    String user = sc1.next().trim().toLowerCase();
                    System.out.println("Introduzca su correo electrónico:");
                    Scanner sc2 = new Scanner(System.in);
                    String mail = sc2.next().trim().toLowerCase();


                    InputStream userIn = new ByteArrayInputStream(user.getBytes());
                    InputStream mailIn = new ByteArrayInputStream(mail.getBytes());

                    byte[] datosUser = userIn.readAllBytes();
                    String userString = new String(datosUser);
                    byte[] datosMail = mailIn.readAllBytes();
                    String mailString = new String(datosMail);

                    usersMails.put(userString, mailString);
                    fileOut.println(usersMails);

                    }catch (IOException e) {
                    System.out.println("Error" + e.getMessage());
                    }
                continue;
            } if (opcion == 2){
                break;
            }
            //Si se introduce un opción no válida, el programa finaliza
            else {
                break;
            }
            //Mientras se introduzca 1, se seguirá reiniciando el bucle
        } while (opcion == 1);
    }

    }
