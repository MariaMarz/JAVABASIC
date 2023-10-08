package com.auto.finland;

public class Car {
    int weight;
    int year;
    String model;

    // Cd + n (Konstruktor)


    public Car(int weight, int year, String model) {
        this(weight, year);

        this.weight = weight;
        this.year = year;
        this.model = model;

        print();


    }

    public Car(int weight, int year) {
        this(weight);
        this.weight = weight;
        this.year = year;
        model = "bmw";
        print();

    }


    public Car(int weight) {
        this();
        this.weight = weight;
        year = 2008;
        model = "audi";

        print();

    }

    public Car() {
        weight = 1430;
        year = 2022;
        model = "fiat";

        print();
    }

    public void print() {
        System.out.println("weight=" + weight + ", year=" + year + ",model=" + model);

    }

}

