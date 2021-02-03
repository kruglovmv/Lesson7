package com.company;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info(){
        System.out.println("В тарелке осталось: "+ food);
    }

    public boolean decreaseFood(int n) {
        if (food >= n) {food = food-n; return true;}
        return false;
    }
    public void increaseFood(int n) {
        food = food+n;
    }

    public int getFood() {
        return food;
    }
}
