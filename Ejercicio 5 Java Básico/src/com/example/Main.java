package com.example;

public class Main {
    static CocheCRUD cocheCrud = new CocheCRUDImpl();

    public static void main(String[] args) {

        Coche coche1 = new Coche("Negro", "Citroen", "C4");
        Coche coche2 = new Coche("Blanco", "Kia", "Carens");
        System.out.println(coche1);
        System.out.println(coche2);
        cocheCrud.save(coche1);
        cocheCrud.save(coche2);
        cocheCrud.findAll();
        cocheCrud.delete(coche2);


    }
}
