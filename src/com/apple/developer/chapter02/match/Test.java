package com.apple.developer.chapter02.match;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入比赛距离：");
        double length = input.nextDouble();
        Match m = new Match(length);
        System.out.print("请输入兔子的速度:");
        double rSpeed = input.nextDouble();
        Animal r = new Rabbit(rSpeed);
        System.out.print("请输入大乌龟的速度：");
        double tSpeed = input.nextDouble();
        Animal t = new Tortoise(tSpeed);
        m.begin(r, t);
    }
}
