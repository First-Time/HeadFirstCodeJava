package chapter13.example13_3;

import java.util.ArrayList;
import java.util.Stack;

public class TestDemo {
    public static void main(String[] args) {
        ArrayList<Book> all = new ArrayList<>();
        Book book = new Book("Java开发实战经典", 79.8);
        all.add(book);
        all.add(new Book("Java Web开发实战经典", 69.8));
        all.add(new Book("Oracle开发实战经典", 89.8));
        all.remove(new Book("Oracle开发实战经典", 89.8));
        all.add(null);
        System.out.println(all);
        Stack
    }
}
