package com.apple.developer.chapter03.shopping;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Scanner input = new Scanner(System.in);

        Goods cardigan = new Cardigan();
        cardigan.setPrice(200);
        Goods shoes = new Shoes();
        shoes.setPrice(300);
        Goods juice = new Juice();
        juice.setPrice(6);
        double sum = 0;

        out:
        do {
            System.out.println("价格：\n1、羊毛衫：" + cardigan.getPrice() + "\t2、子：" + shoes.getPrice() + "\t3、果汁：" + juice.getPrice());
            System.out.print("请输入你要购买的商品编号：");
            int no = input.nextInt();
            System.out.print("请输入您要购买的数量：");
            int num = input.nextInt();
            if (no == 1) {
                sum += customer.getSum(cardigan, num);
                System.out.println("您已成功购买羊毛衫" + num + "件");
            }
            if (no == 2) {
                sum += customer.getSum(shoes, num);
                System.out.println("您已成功购买鞋子" + num + "双");
            }
            if (no == 3) {
                sum += customer.getSum(juice, num);
                System.out.println("您已成功购买果汁" + num + "瓶");
            }

            System.out.println("1、继续购物\t2、退出");
            System.out.print("请选择：");
            int choice = input.nextInt();
            if (choice == 2)
                break out;
        } while (true);
        System.out.println("您一共消费" + sum + ",欢迎下次光临！");

    }


}
