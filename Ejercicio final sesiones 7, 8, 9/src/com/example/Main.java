package com.example;

import java.io.*;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    //Crea un programa de tu elección que utilice InputStream, PrintStream,
    // excepciones, un HashMap y un ArrayList, LinkedList o array.

    public static void main(String[] args) throws FileNotFoundException, InputMismatchException {

        Scanner sc = new Scanner(System.in);
        HashMap<String, String> usersMails = new HashMap<>();
        PrintStream fileOut = new PrintStream("C:\\ejemplo3.txt");
        int opcion;

        do {
            System.out.println("Elija una opción:");
            System.out.println("1. Introduzca usuario y mail");
            System.out.println("2. Salir");

            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("Introduzca su usuario:");
                String user = sc.next();
                System.out.println("Introduzca su correo electrónico:");
                String mail = sc.next();

                InputStream userIn = new ByteArrayInputStream(user.getBytes());
                InputStream mailIn = new ByteArrayInputStream(mail.getBytes());

                try {

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

                } while (opcion !=2);
        }
        }


