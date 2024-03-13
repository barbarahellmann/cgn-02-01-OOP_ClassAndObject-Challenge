package org.example;

public class Car {
    String brand;
    String model;
    String color;
    int ManuYear;
    int Speed = 50;

    public void starts(){
        System.out.println("BrumBrum");
    }

    public void goFaster(){
        this.Speed++;
    }

}
