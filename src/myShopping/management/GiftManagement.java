package myShopping.management;

import myShopping.data.Customer;
import myShopping.data.Gift;
import myShopping.data.Goods;

import java.util.Scanner;

public class GiftManagement {
    private Goods goods[];
    private Customer customers[];

    public GiftManagement(Goods[] goods, Customer[] customers) {
        this.goods = goods;
        this.customers = customers;
    }

    public void returnLastMenu() {
        System.out.println("\n\n请按'n'返回上一级菜单:");
        Scanner input = new Scanner(System.in);
        boolean con = true;
        do {
            if (input.next().equals("n")) {
                Menu menu = new Menu(goods, customers);
                menu.showSendMenu();
            } else {
                System.out.println("输入错误，请重新'n'返回上一级菜单：");
                con = false;
            }
        } while (!con);
    }

    public void sendBirthCust() {
        System.out.println("Genshin购物管理系统 > 生日问候\n");
        System.out.print("请输入今天的日期(月/日<用两位数表示>)：");
        Scanner input = new Scanner(System.in);
        String day = input.next();
        int length = customers.length;
        boolean con = true;
        for (int i = 0; i < length; i++) {
            if (customers[i].getCustBirth().equals(day)) {
                System.out.println("祝会员号为" + customers[i].getCustNo() + "的用户生日快乐！");
                con = false;
                break;
            }
        }
        if (con) {
            System.out.println("今天没有过生日的会员！");
        }
        returnLastMenu();
    }

    public  void sendLuckyCust() {
        System.out.println("Genshin购物管理系统 > 幸运抽奖");
        System.out.println("是否开始(y/n)");
        Scanner input = new Scanner(System.in);
        String choice = input.next();
        if (choice.equals("y")) {
            System.out.println("无幸运客户");
        }
        returnLastMenu();
    }

    public void sendGoldenCust() {
        System.out.println("Genshin购物管理系统 > 幸运大放送\n\n");
        int index = 0;
        int max = customers[0].getCustScore();
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getCustScore() == 0) {
                break;
            }

            if (customers[i].getCustScore() > max) {
                max = customers[i].getCustScore();
                index = 1;
            }
        }
        System.out.println("具有最高积分的会员是： " + customers[index].getCustNo() + "\t" + customers[index].getCustScore());

        Gift laptop = new Gift();
        laptop.setName("苹果笔记本电脑");
        laptop.setPrice(12000);
        System.out.println("恭喜! 获赠奖品： ");
        System.out.println(laptop);
        returnLastMenu();
    }
}
