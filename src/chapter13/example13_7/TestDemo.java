package chapter13.example13_7;

import java.util.Set;
import java.util.TreeSet;

public class TestDemo {
    public static void main(String[] args) {
        Set<Book> all = new TreeSet<>();
        all.add(new Book("Java开发实战经典", 79.8));
        all.add(new Book("Java开发实战经典", 79.8));
        all.add(new Book("JSP开发实战经典", 79.8));
        all.add(new Book("Android开发实战经典", 89.8));
        System.out.println(all);
    }
}
