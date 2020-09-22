package com.apple.developer.chapter02.match;

public class Match {
    private double length;

    protected Match(double length) {
        this.length = length;
    }

    public void begin(Animal r, Animal t) {
        System.out.println(this.length + "米，兔子跑了" + r.run(this.length) + "秒,乌龟跑了" + t.run(this.length) + "秒");
    }

}
