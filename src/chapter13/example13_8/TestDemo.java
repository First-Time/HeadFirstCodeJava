package chapter13.example13_8;

import java.util.HashSet;
import java.util.Set;

public class TestDemo {
    public static void main(String[] args) {
        Set<Book> all = new HashSet<>();
        all.add(new Book("Java开发实战经典", 79.8));
        all.add(new Book("Java开发实战经典", 79.8));
        all.add(new Book("JSP开发实战经典", 79.8));
        all.add(new Book("Android开发实战经典", 89.8));
        System.out.println(all);
    }
}
