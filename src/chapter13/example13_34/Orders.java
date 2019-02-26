package chapter13.example13_34;

public class Orders {
    private String pname;
    private double price;
    private int amount;

    public Orders(String pname, double price, int amount) {
        this.pname = pname;
        this.price = price;
        this.amount = amount;
    }

    public String getPname() {
        return pname;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }
}
