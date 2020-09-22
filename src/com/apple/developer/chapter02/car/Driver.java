package com.apple.developer.chapter02.car;

public class Driver {
    private String name;

    protected void setter(String name) {
        this.name = name;
    }

    protected String getter() {
        return this.name;
    }

    protected void driver(Benz benz) {
        System.out.println(getter() + "在开车");
        benz.run();
    }
}
