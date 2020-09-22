package com.apple.developer.chapter02.doctor;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1、专业医生\t2、非专业医生");
        System.out.print("请选择：");
        int in = input.nextInt();
        String name = null;
        String id = null;
        String address = null;
        String speciality = null;
        System.out.println("请依次输入年龄、编号、地址：");
        name = input.next();
        id = input.next();
        address = input.next();
        if (in == 1) {
            System.out.print("请输入专业:");
            speciality = input.next();
            Doctor d = new Specialist(name, id, address, speciality);
            getInfo(d);
        }
        if (in == 2) {
            Doctor d = new NoSpecialist(name, id, address);
            getInfo(d);
        }

    }

    public static void getInfo(Doctor d) {
        d.getInfo();
    }
}
