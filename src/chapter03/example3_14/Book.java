package chapter03.example3_14;

public class Book {
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public void getInfo() {
        System.out.println("图书名称：" + title + "，价格：" + price);
    }
}
