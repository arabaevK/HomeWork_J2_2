package com.company;

public class Mercedes extends Car {
    private int age;

    public Mercedes(String color) {
        super(color);
    }

    public int getAge() {
        return age;
    }

    @Override
    public void print() {
        System.out.println(2005);

    }
}
