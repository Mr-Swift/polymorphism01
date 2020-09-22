package com.apple.developer.chapter03.shopping;

public class Juice extends Goods {
    @Override
    protected double getSum(int num) {
        if (num > 0 && num < 3)
            return num * this.price;
        if (num > 2 && num < 7)
            return num * this.price * 0.9;
        if (num > 6 && num < 11)
            return num * this.price * 0.85;
//        if(num>10)
//            return num*this.price*0.8;
        return num * this.price * 0.8;
    }

}
