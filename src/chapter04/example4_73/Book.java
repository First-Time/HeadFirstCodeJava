package chapter04.example4_73;

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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Book)) {
            return false;
        }
        Book book = (Book) obj;
        if (this.title.equals(book.title) && this.price == book.price) {
            return true;
        }
        return false;
    }
}
