package com.example;

public class Main {

    public static void main(String[] args) {

        SmartPhone smartPhone1 = new SmartPhone("Azul", "ZTE", "Blade A31", "SC9832E", 5, "Android", "Single Cam", "16 GB", "1 GB", true, "5 HD");
        SmartWatch smartWatch1 = new SmartWatch("Rosa", "Vieta", "Beat 3", "MediaTek MT2502", 1.65, "Android", true, true, true, "3 días");

        System.out.println(smartPhone1);
        System.out.println(smartWatch1);

    }

}
