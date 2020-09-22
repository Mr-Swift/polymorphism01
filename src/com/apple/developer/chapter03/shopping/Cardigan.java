package com.apple.developer.chapter03.shopping;

public class Cardigan extends Goods {
    @Override
    protected double getSum(int num) {
        return num * this.price * 0.8;
    }

}
