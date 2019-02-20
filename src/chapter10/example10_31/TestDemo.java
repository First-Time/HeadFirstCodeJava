package chapter10.example10_31;

import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        Book[] books = new Book[]{
                new Book("Java开发实战经典", 79.9),
                new Book("JavaWeb开发实战经典", 69.9),
                new Book("Oracle开发实战经典", 99.9),
                new Book("Android开发实战经典", 89.9)
        };
        Arrays.sort(books);
        System.out.println(Arrays.toString(books));
    }
}
