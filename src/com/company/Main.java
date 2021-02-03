package com.company;

public class Main {

    public static void main(String[] args) {
        Cat[] cats = new Cat[10];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("Cat" + i, i *2);
        }
        Plate plate = new Plate(100);
        plate.info();
        while (plate.getFood() > 0) {
            for (Cat cat : cats) {
                cat.eat(plate);
                cat.info();
                plate.info();
            }
        }
        plate.increaseFood(250);
        plate.info();
    }
}
