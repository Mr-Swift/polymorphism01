package com.apple.developer.chapter02.car;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("请输入发动机功率：");
        int power = input.nextInt();
        Engine engine = new Engine();
        engine.setter(power);

        Benz benz = new Benz();
        benz.setter(engine);

        System.out.print("请输入驾驶员名字：");
        String driverName = input.next();
        Driver driver = new Driver();
        driver.setter(driverName);
        driver.driver(benz);
    }
}
