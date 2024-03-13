package org.example;

public class Main {
    public static void main(String[] args) {
        Car usedCar = new Car();
        Car lamborghiniCar = new Car();
        usedCar.starts();
        System.out.println(lamborghiniCar.Speed);
        lamborghiniCar.goFaster();
        System.out.println(lamborghiniCar.Speed);
        System.out.println(usedCar.Speed);
    }
}