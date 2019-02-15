package chapter04.example4_72;

public class Book {
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String toString() {
        return "书名：" + this.title + "，价格：" + this.price;
    }
}
