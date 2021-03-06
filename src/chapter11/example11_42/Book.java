package chapter11.example11_42;

import java.io.Serializable;

public class Book implements Serializable {
    private transient String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "书名：" + this.title + "，价格：" + this.price;
    }
}
