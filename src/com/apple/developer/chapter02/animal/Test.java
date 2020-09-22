package com.apple.developer.chapter02.animal;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1、鸟\t2、鱼");
        System.out.print("请选择：");
        int in = input.nextInt();
        if (in == 1) {
            System.out.println("鸟，请输入年龄和颜色：");
            int age = input.nextInt();
            String color = input.next();
            Animal a = new Bird(age, color);
            info(a);
        }
        if (in == 2) {
            System.out.println("鱼，请输入年龄和重量：");
            int age = input.nextInt();
            double weight = input.nextDouble();
            ;
            Animal a = new Fish(age, weight);
            info(a);
        }
    }

    public static void info(Animal a) {
        a.info();
    }
}
