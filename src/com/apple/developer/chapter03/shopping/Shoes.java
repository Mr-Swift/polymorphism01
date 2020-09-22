package com.apple.developer.chapter03.shopping;

public class Shoes extends Goods {
    @Override
    protected double getSum(int num) {
        if (num * this.price >= 200)
            return (num * this.price - 20);
        return num * this.price;
    }

}
