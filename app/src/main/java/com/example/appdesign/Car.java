package com.example.appdesign;

public class Car {
    private String make;
    private double engine;
    private int year;
    private double price;
    private String color;

    public Car(String make, int year, String color, double price, double engine) {
        this.make = make;
        this.engine = engine;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
