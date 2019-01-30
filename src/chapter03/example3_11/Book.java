package chapter03.example3_11;

public class Book {
    private String title;
    private double price;

    public Book() {
        System.out.println("**************************");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0.0) {
            this.price = price;
        }
    }

    public void getInfo() {
        System.out.println("图书名称：" + title + "，价格：" + price);
    }
}
