package myShopping.data;

public class Data {

    private Goods goods[] = new Goods[50];

    private Customer customers[] = new Customer[100];

    private Manager manager = new Manager();
    public Goods[] getGoods() {
        return goods;
    }
    public void setGoods(Goods[] goods) {
        this.goods = goods;
    }
    public Customer[] getCustomers() {
        return customers;
    }
    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }
    public Manager getManager() {
        return manager;
    }
    public void setManager(Manager manager) {
        this.manager = manager;
    }
    public Data() {
        for (int i = 0; i < goods.length; i++) {
            goods[i] = new Goods();
        }

        goods[0].setGoodsName("addidas运动鞋");
        goods[0].setGoodsPrice(880);
        goods[1].setGoodsName("Kappa网球裙");
        goods[1].setGoodsPrice(200);
        goods[2].setGoodsName("网球拍");
        goods[2].setGoodsPrice(780);
        goods[3].setGoodsName("addidasT恤");
        goods[3].setGoodsPrice(420.78);
        goods[4].setGoodsName("Nike运动鞋");
        goods[4].setGoodsPrice(900);
        goods[5].setGoodsName("Kappa网球");
        goods[5].setGoodsPrice(45);
        goods[6].setGoodsName("KappaT恤");
        goods[6].setGoodsPrice(245);

        for (int i = 0; i < customers.length; i++) {
            customers[i] = new Customer();
        }
        customers[0].setCustNo(1900);
        customers[0].setCustBirth("08/05");
        customers[0].setCustScore(2000);
        customers[1].setCustNo(1711);
        customers[1].setCustBirth("07/13");
        customers[1].setCustScore(4000);
        customers[2].setCustNo(1623);
        customers[2].setCustBirth("06/26");
        customers[2].setCustScore(5000);
        customers[3].setCustNo(1545);
        customers[3].setCustBirth("04/08");
        customers[3].setCustScore(2200);
        customers[4].setCustNo(1464);
        customers[4].setCustBirth("08/16");
        customers[4].setCustScore(1000);
        customers[5].setCustNo(1372);
        customers[5].setCustBirth("12/23");
        customers[5].setCustScore(3000); customers[6].setCustNo(1286);
        customers[6].setCustBirth("12/21");
        customers[6].setCustScore(10080);
    }
}
