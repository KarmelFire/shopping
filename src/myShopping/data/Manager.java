package myShopping.data;

public class Manager {
 private String username = "admin";

 private String password = "123";

 public String getUsername() {
  return username;
 }

 public void setUsername(String username) {
  this.username = username;
 }

 public String getPassword() {
  return password;
 }

 public void setPassword(String password) {
  this.password = password;
 }

 @Override
 public String toString() {
  return "Manager{" +
          "username='" + username + '\'' +
          ", password='" + password + '\'' +
          '}';
 }
}

