package org.example.telewizor;

public class Main {
    public static void main(String[] args) {
        Tv samsung = new Tv();
        samsung.producer = "SAMSUNG";
        samsung.model = "OLED-Q1-55A";
        samsung.year = 2022;
        samsung.printBasicData();

        Tv sony = new Tv();
        sony.producer = "SONY";
        sony.model = "BRAVIA-XR-90j";
        sony.year = 2022;
        sony.printBasicData();
    }
}
