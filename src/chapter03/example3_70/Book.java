package chapter03.example3_70;

public class Book {
    private String title;
    private double price;

    public Book(String title, double price) {
//        this.title = title;
//        this.price = price;
        title = title;
        price = price;
    }

    public String getInfo() {
        return "书名：" + title + "，价格：" + price;
    }
}
