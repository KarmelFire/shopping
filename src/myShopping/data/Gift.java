package myShopping.data;

public class Gift {
    private String name;
    private double price;
    public String getName() {
        return name;
    }
  public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String toString() {
        return "一个价值￥" + price + "的" + name;
 }

}
