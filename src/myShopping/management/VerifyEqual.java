package myShopping.management;
import myShopping.data.Manager;

import java.util.Scanner;

public class VerifyEqual {
    Manager manager = new Manager();
    public boolean verify(String Username, String Password) {
        return Username.equals(manager.getUsername()) && Password.equals(manager.getPassword());
    }
}
