package com.apple.developer.chapter02.car;

public class Engine {
    private int power;

    public void setter(int power) {
        this.power = power;
    }

    public int getter() {
        return this.power;
    }

    public void work() {
        System.out.println(this.power + "功率的发动机在运转");
    }
}
