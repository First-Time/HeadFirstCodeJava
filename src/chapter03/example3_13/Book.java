package chapter03.example3_13;

public class Book {
    private String title;
    private double price;

    public Book() {
        System.out.println("无参构造");
    }

    public Book(String title) {
        this.title = title;
        System.out.println("有一个参数的构造");
    }

    public Book(String title, double price) {
        setTitle(title);
        setPrice(price);
        System.out.println("有两个参数的构造");
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
