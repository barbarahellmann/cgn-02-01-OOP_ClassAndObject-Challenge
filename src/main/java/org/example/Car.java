package org.example;

public class Car {
    String brand;
    String model;
    String color;
    String manuYear;
    int Speed = 50;

    public void starts(){

        System.out.println("The " + brand + model + " from " + manuYear + " is " + color + ".");
    }

    public Car(String brand, String model, String color, String manuYear, int speed) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.manuYear = manuYear;
        Speed = speed;
    }

    public void goFaster(){
        this.Speed++;
    }

}
