package com.apple.developer.chapter02.match;

public class Animal {
    public double speed;

    protected Animal(double speed) {
        this.speed = speed;
    }

    protected double run(double length) {
        return length / this.speed;
    }
}
