package chapter13.example13_18;

import java.util.HashMap;
import java.util.Map;

public class TestDemo {
    public static void main(String[] args) {
        Map<Book, String> map = new HashMap<>();
        map.put(new Book("Java开发"), new String("Java"));
        System.out.println(map.get(new Book("Java开发")));
    }
}
