package com.company;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate plate){
        this.satiety = plate.decreaseFood(appetite);
    }
    public void info(){
        System.out.println(name +" " + ((satiety)?" наелась":" жутко голодна"));
    }
}