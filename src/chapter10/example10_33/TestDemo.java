package chapter10.example10_33;

import java.util.Arrays;
import java.util.Comparator;

public class TestDemo {
    public static void main(String[] args) {
        Book[] books = new Book[]{
                new Book("Java开发实战经典", 79.9),
                new Book("JavaWeb开发实战经典", 69.9),
                new Book("Oracle开发实战经典", 99.9),
                new Book("Android开发实战经典", 89.9)
        };
        Arrays.sort(books, (o1, o2) -> {
            if (o1.getPrice() > o2.getPrice()) {
                return 1;
            } else if (o1.getPrice() < o2.getPrice()) {
                return -1;
            } else {
                return 0;
            }
        });
        System.out.println(Arrays.toString(books));
    }
}
