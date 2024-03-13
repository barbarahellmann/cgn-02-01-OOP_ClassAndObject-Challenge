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

        Person Christian = new Person("Christian", 25, "male");
        Person Dean = new Person("Dean", 29, "male");
        Person Dominik = new Person("Dominik", 33, "male");
        System.out.println("Hello, I am " + Christian.name + " and " + Christian.age + " years old.");
        System.out.println("Hello, I am " + Dean.name + " and I´m " + Dean.gender + ".");
        System.out.println("Hello, I am " + Dominik.name + " and " + Dominik.age + " years old.");
    }
}