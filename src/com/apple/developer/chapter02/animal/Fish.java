package com.apple.developer.chapter02.animal;

public class Fish extends Animal {
    private double weight;

    @Override
    protected void info() {
        System.out.println("我是一只" + this.weight + "斤重的鱼！");
        System.out.println("我今年" + this.age + "岁了！");
    }

    protected Fish(int age, double weight) {
        super(age);
        this.weight = weight;
    }
}
