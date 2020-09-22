package com.apple.developer.chapter03.shopping;

public abstract class Goods {
    protected double price;

    protected void setPrice(double price) {
        this.price = price;
    }

    protected double getPrice() {
        return this.price;
    }

    protected abstract double getSum(int num);
}
