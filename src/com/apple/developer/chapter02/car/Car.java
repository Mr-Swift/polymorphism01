package com.apple.developer.chapter02.car;

public class Car {
    protected Engine engine;

    protected void setter(Engine engine) {
        this.engine = engine;
    }

    protected Engine getter() {
        return this.engine;
    }

    protected void run() {
        if (getter() == null)
            System.out.println("发动机发动不了");
        else
            System.out.println(engine.getter() + "功率的发动机在运转，汽车在跑");
    }
}

