package myShopping.management;

import myShopping.data.Customer;
import myShopping.data.Gift;
import myShopping.data.Goods;

import java.util.Scanner;

public class Menu {
    private Goods goods[];
    private Customer customers[];

    public Menu(Goods[] goods, Customer[] customers) {
        this.goods = goods;
        this.customers = customers;
    }
    Scanner sc = new Scanner(System.in);

    public void showLoginMenu() {
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * *\n");
        System.out.println("\t\t\t1.登 录 系 统\n");
        System.out.println("\t\t\t2.更 改 管 理 员 密 码\n");
        System.out.println("\t\t\t3.退 出\n");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * *\n");
    }

    public void showMainMenu() {
        System.out.println("\t\t\t欢迎使用Genshin购物管理系统\n");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * *\n");
        System.out.println("\t\t\t1.客 户 信 息 管 理\n");
        System.out.println("\t\t\t2.购 物 结 算\n");
        System.out.println("\t\t\t3.真 情 回 馈\n");
        System.out.println("\t\t\t4.注 销\n");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * *\n");
        System.out.print("请选择,输入数字:");
        Scanner input = new Scanner(System.in);
        boolean con = true;
        do {
            String num = input.next();
            if (num.equals("1")) {
                showCustMenu();
                break;
            } else if (num.equals("2")) {
                Pay pay = new Pay(goods, customers);
                pay.calcPrice();
                break;
            } else if (num.equals("3")) {
                showSendMenu();
                break;
            } else if (num.equals("4")) {
                System.out.println("谢谢您的使用! ");
                System.exit(0);
            } else {
                System.out.println("输入错误， 请重新输入数字：");
                con = false;
            }
        } while (!con);

    }


    public void showCustMenu() {
        System.out.println("Genshin购物管理系统 > 客户信息管理\n");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * *\n");
        System.out.println("\t\t\t1.显 示 所 有 客 户 信 息\n");
        System.out.println("\t\t\t2.添 加 客 户 信 息\n");
        System.out.println("\t\t\t3.修 改 客 户 信 息\n");
        System.out.println("\t\t\t4.查 询 客 户 信 息\n");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * *\n");
        System.out.print("请选择,输入数字或按'n'返回上一级菜单:");
        Scanner input = new Scanner(System.in);
        boolean con = true;
        do {
            CustManagement cm = new CustManagement(goods, customers);
            String num = input.next();
        if (num.equals("1")) {
            cm.show();
            break;
        } else if (num.equals("2")) {
            cm.add();
            break;
        } else if (num.equals("3")) {
            cm.modify();
            break;
        } else if (num.equals("4")) {
            cm.search();
            break;
        } else if (num.equals("n")) {
            showMainMenu();
            break;
        } else {
            System.out.println("输入错误，请重新输入数字：");
            con = false;
        }
        } while (!con);
    }

    //真情回馈菜单
    public void showSendMenu() {
        System.out.println("Genshin购物管理系统 > 真情回馈\n");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * *\n");
        System.out.println("\t\t\t1.幸 运 大 放 送\n");
        System.out.println("\t\t\t2.幸 运 抽 奖\n");
        System.out.println("\t\t\t3.生 日 问 候\n");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * *\n");
        System.out.print("请选择,输入数字或按'n'返回上一级菜单:");
        Scanner input = new Scanner(System.in);
        boolean con = true;
        do {
            GiftManagement gm = new GiftManagement(goods, customers);
            String num = input.next();
            if (num.equals("1")) {
                gm.sendGoldenCust();
                break;
            } else if (num.equals("2")) {
                gm.sendLuckyCust();
                break;
            } else if (num.equals("3")) {
                gm.sendBirthCust();
                break;
            } else if (num.equals("n")) {
                showMainMenu();
                break;
            } else {
                System.out.println("输入错误，请重新输入数字：");
                con = false;
            }
        } while (!con);
    }
}
