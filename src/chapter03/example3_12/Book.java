package chapter03.example3_12;

public class Book {
    private String title;
    private double price;

    public Book(String title, double price) {
        setTitle(title);
        setPrice(price);
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
        this.price = price;
    }

    public void getInfo() {
        System.out.println("图书名称：" + title + "，价格：" + price);
    }
}
