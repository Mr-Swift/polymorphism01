package com.apple.developer.chapter02.animal;

public final class Bird extends Animal {
    private String color;

    @Override
    protected void info() {
        System.out.println("我是一只" + this.color + "的鸟!");
        System.out.println("我今年" + this.age + "岁了！");
    }

    protected Bird(int age, String color) {
        super(age);
        this.color = color;
    }
}
