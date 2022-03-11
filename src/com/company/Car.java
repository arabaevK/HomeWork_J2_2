package com.company;

public abstract class Car implements Printable{
    private String color;

    public String getColor() {
        return color;
    }

    public Car(String color) {
        this.color = color;
    }

}
