package com.company;

public class Main {

    public static void main(String[] args) {
        Printable[] object = {createObject("1"), createObject("2"), createObject("3")};
        for (Printable car : object) {
            car.print();
        }
    }

    public static Printable createObject(String car) {
        Printable  printable = null;
        switch (car) {
            case "1":
                printable = new Model("RED");
                break;
            case "2":
               printable = new BMW("1");
                break;
            case "3":
                printable = new Mercedes("BLACK");
                break;
        }
        return printable;
    }
}
