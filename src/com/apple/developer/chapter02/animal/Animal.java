package com.apple.developer.chapter02.animal;

public abstract class Animal {
    protected int age;

    protected Animal(int age) {
        this.age = age;
    }

    protected abstract void info();
}
