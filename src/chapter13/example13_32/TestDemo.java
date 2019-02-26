package chapter13.example13_32;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestDemo {
    public static void main(String[] args) throws IOException {
        List<chapter13.example13_33.Orders> all = new ArrayList<>();
        all.add(new chapter13.example13_33.Orders("Java开发经典实战", 79.8, 200));
        all.add(new chapter13.example13_33.Orders("JavaWeb开发经典实战", 69.8, 500));
        all.add(new chapter13.example13_33.Orders("Android开发经典实战", 89.8, 300));
        all.add(new chapter13.example13_33.Orders("Oracle开发经典实战", 99.0, 800));
        all.stream().map(x -> x.getAmount() * x.getPrice())
                .forEach(System.out::println);
    }
}
