package myShopping.management;

import myShopping.data.Customer;
import myShopping.data.Goods;

import java.util.Scanner;

public class Pay {
    private Goods goods[];
    private Customer customers[];

    public Pay(Goods[] goods, Customer[] customers) {
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
                menu.showMainMenu();
            } else {
                System.out.println("输入错误，请重新'n'返回上一级菜单：");
                con = false;
            }
        } while (!con);
    }

    public void calcPrice() {
        boolean con = true;
        do {
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * *\n");
        System.out.println("请选择购买的商品编号：");
        int length = goods.length;
        for (int i = 0; i < length; i++) {
            if (goods[i].getGoodsPrice() == 0) {
                break;
            }
            System.out.println((i + 1) + ":" + goods[i].getGoodsName());
        }
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * *\n");
        Scanner input = new Scanner(System.in);
        System.out.print("请输入会员号：");
        int custNo = input.nextInt();
        System.out.print("请输入商品编号：");
        int goodsNo = input.nextInt();
        System.out.print("请输入数目：");
        int count = input.nextInt();
            System.out.println("* * * * * * * * * * 消 费 清 单 * * * * * * * * * *\n");
            System.out.println("物品       单价       个数       金额\n");
            for (int i = 0; i < length; i++) {
                if (i == custNo - 1) {
                System.out.println(goods[goodsNo - 1].getGoodsName() + "\t" + "￥" + goods[goodsNo - 1].getGoodsPrice() + "\t" + count + "\t" + "￥" + goods[goodsNo - 1].getGoodsPrice() * count);
                    System.out.println("折扣：    0.95");
                    double price = goods[goodsNo - 1].getGoodsPrice() * count * 0.95;
                    System.out.println("金额统计：￥" + price);
                    System.out.print("实际交费：￥");
                    double pay = input.nextInt();
                    System.out.println("找钱：   ￥" + (pay - price));
                break;
                }
            }
        System.out.println("是否继续(y/n)");
        String choice = input.next();
        if (choice.equals("y")) {
            con = true;
        } else if (choice.equals("n")) {
            con = false;
        }
        } while (con);
        returnLastMenu();
    }
}
