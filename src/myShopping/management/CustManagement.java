package myShopping.management;

import myShopping.data.Customer;
import myShopping.data.Goods;

import java.util.Scanner;

public class CustManagement {

     private Goods goods[];
     private Customer customers[];

     public CustManagement(Goods[] goods, Customer[] customers) {
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
                 menu.showCustMenu();
             } else {
                 System.out.println("输入错误，请重新'n'返回上一级菜单：");
                 con = false;
             }
         } while (!con);
     }

     public void add() {
         System.out.println("Genshin购物系统 > 客户信息管理 > 添加客户信息\n");
         boolean con = true;
         do {
         Scanner input = new Scanner(System.in);
         Customer customer = new Customer();
         System.out.print("请输入会员号(<4位整数>)：");
         int custNo = input.nextInt();
         System.out.print("请输入会员生日(月/日<用两位数表示>)：");
         String custBirth = input.next();
         System.out.print("请输入积分：");
         int custScore = input.nextInt();
         int length = customers.length;
         for (int i = 0; i < length; i++) {
             if (customers[i].getCustNo() == 0) {
                 customers[i].setCustNo(custNo);
                 customers[i].setCustBirth(custBirth);
                 customers[i].setCustScore(custScore);
                 break;
             }
         }
         System.out.println("新会员添加成功！");
         System.out.println("继续添加会员吗？(y/n)");
         String choice = input.next();
         if (choice.equals("y")) {
             con = true;
         } else if (choice.equals("n")) {
             con = false;
         }
         } while (con);
         returnLastMenu();
     }

     public void modify() {
         System.out.println("Genshin购物管理系统 > 客户信息管理 > 修改客户信息\n");
         Scanner input = new Scanner(System.in);
         System.out.print("请输入会员号：");
         int custNo = input.nextInt();
         System.out.println("  会议号             生日             积分      ");
         System.out.println("-------------|------------|---------------");
         int length = customers.length;
         for (int i = 0; i < length; i++) {
             if (customers[i].getCustNo() == custNo) {
                 System.out.println(customers[i].getCustNo() + "\t\t"
                         + customers[i].getCustBirth() + "\t\t" + customers[i].getCustScore());
                 break;
             }
         }
         boolean con = true;
         do {
         System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * *\n");
         System.out.println("\t\t\t1.修 改 会 员 生 日\n");
         System.out.println("\t\t\t2.修 改 会 员 积 分\n");
         System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * *\n");
         System.out.print("请选择，输入数字：");
         int num = input.nextInt();
         if (num == 1) {
             System.out.print("请输入修改过的会员生日：");
             String custBirth = input.next();
             for (int i = 0; i < length; i++) {
                 if (customers[i].getCustNo() == custNo) {
                     customers[i].setCustBirth(custBirth);
                     break;
                 }
             }
             System.out.println("会员生日已更改！");
         } else if (num == 2) {
             System.out.print("请输入修改过的会员积分：");
             int custScore = input.nextInt();
             for (int i = 0; i < length; i++) {
                 if (customers[i].getCustNo() == custNo) {
                     customers[i].setCustScore(custScore);
                     break;
                 }
             }
             System.out.println("会员积分已更改！");
         }
         System.out.println("是否修改其他属性(y/n):");
         String choice = input.next();
         if (choice.equals("y")) {
             con = true;
         } else if (choice.equals("n")) {
             con = false;
         }
         } while (con);
         returnLastMenu();
     }

     public void search() {
         System.out.println("Genshin购物管理系统 > 客户信息管理 > 查询客户信息\n");
         Scanner input = new Scanner(System.in);
         boolean con = true;
         do {
         System.out.print("请输入会员号：");
         int custNo = input.nextInt();
         System.out.println("  会议号             生日             积分      ");
         System.out.println("-------------|------------|---------------");
         int length = customers.length;
         for (int i = 0; i < length; i++) {
             if (customers[i].getCustNo() == custNo) {
                 System.out.println(customers[i].getCustNo() + "\t\t"
                         + customers[i].getCustBirth() + "\t\t" + customers[i].getCustScore());
                 break;
             }
         }
         System.out.println("要继续查询吗(y/n)");
             String choice = input.next();
             if (choice.equals("y")) {
                 con = true;
             } else if (choice.equals("n")) {
                 con = false;
             }
         } while (con);
         returnLastMenu();
     }

     public void show() {
         System.out.println("Genshin购物管理系统 > 客户信息管理 > 显示客户信息\n\n");
         System.out.println("  会议号             生日             积分      ");
         System.out.println("-------------|------------|---------------");
         int length = customers.length;
         for (int i = 0; i < length; i++) {
             if (customers[i].getCustNo() == 0) {
                 break;
             }
             System.out.println(customers[i].getCustNo() + "\t\t"
                     + customers[i].getCustBirth() + "\t\t" + customers[i].getCustScore());
         }
         returnLastMenu();
     }
}

