package myShopping.management;

import myShopping.data.Data;
import myShopping.data.Manager;

import java.util.Scanner;

public class StartSMS {
    public static void main(String[] args) {
        Data initial = new Data();
        Menu menu = new Menu(initial.getGoods(), initial.getCustomers());
        Manager manager = new Manager();
        menu.showLoginMenu();
        boolean con = true;
        while(con){
            Scanner input = new Scanner(System.in);
            System.out.print("请选择，输入数字：");
            int choice = input.nextInt();
            VerifyEqual pv = new VerifyEqual();
            switch(choice){
                case 1:
                    boolean con1 = true;
                    do {
                        System.out.print("请输入用户名：");
                        String name = input.next();
                        System.out.print("请输入密码：");
                        String pwd = input.next();
                        if (pv.verify(name, pwd)) {
                            menu.showMainMenu();
                            con1 = false;
                        } else {
                            System.out.println("用户名和密码不匹配,请重新输入：");
                        }
                    } while (con1);
                    break;

                    case 2:
                        boolean con2 = true;
                        do {
                            System.out.print("请输入用户名：");
                            String name = input.next();
                            System.out.print("请输入密码：");
                            String pwd = input.next();
                            System.out.print("请输入新的用户名：");
                            String newName = input.next();
                            System.out.print("请输入新的密码：");
                            String newPwd = input.next();
                            if (pv.verify(name, pwd)) {
                                System.out.print("再次输入新的密码：");
                                String newPwd1 = input.next();
                                manager.setUsername(newName);
                                manager.setPassword(newPwd);
                                System.out.println("用户名和密码已更改！");
                                con2 = false;
                            } else {
                                System.out.println("用户名和密码不匹配,请重试：");
                            }
                        } while (con2);
                        break;

                        case 3:
                            System.out.println("谢谢您的使用！");
                            con = false;
                            break;
                            default:
                                System.out.print("\n输入有误！请重新选择，输入数字: ");
            }
            if(!con){
                break;
            }
        }
    }
}