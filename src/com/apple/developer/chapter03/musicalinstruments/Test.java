package com.apple.developer.chapter03.musicalinstruments;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Musician m = new Musician();
        Scanner input = new Scanner(System.in);
        System.out.println("钢琴\t小提琴\t萨克斯");
        System.out.print("请选择：");
        String in = input.next();

        if (in.equals("钢琴")) {
            Instrument i = new Piano();
            i.setName(in);
            m.play(i);
        }
        if (in.equals("小提琴")) {
            Instrument i = new Violin();
            i.setName(in);
            m.play(i);

        }
        if (in.equals("萨克斯")) {
            Instrument i = new Saxophone();
            i.setName(in);
            m.play(i);
        }

    }
}
