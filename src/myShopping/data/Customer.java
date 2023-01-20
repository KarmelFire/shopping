package myShopping.data;

public class Customer {
     private int custNo;
    private String custBirth;
    private int custScore;

    public int getCustNo() {
        return custNo;
    }

    public void setCustNo(int custNo) {
        this.custNo = custNo;
    }

    public String getCustBirth() {
        return custBirth;
    }

    public void setCustBirth(String custBirth) {
        this.custBirth = custBirth;
    }

    public int getCustScore() {
        return custScore;
    }

    public void setCustScore(int custScore) {
        this.custScore = custScore;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custNo=" + custNo +
                ", custBirth='" + custBirth + '\'' +
                ", custScore=" + custScore +
                '}';
    }
}
