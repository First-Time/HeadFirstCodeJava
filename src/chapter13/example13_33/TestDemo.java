package chapter13.example13_33;

import chapter13.example13_32.Orders;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestDemo {
    public static void main(String[] args) throws IOException {
        List<chapter13.example13_32.Orders> all = new ArrayList<>();
        all.add(new chapter13.example13_32.Orders("Java开发经典实战", 79.8, 200));
        all.add(new chapter13.example13_32.Orders("JavaWeb开发经典实战", 69.8, 500));
        all.add(new chapter13.example13_32.Orders("Android开发经典实战", 89.8, 300));
        all.add(new Orders("Oracle开发经典实战", 99.0, 800));
        double allPrice = all.stream()
                .map(x -> x.getAmount() * x.getPrice())
                .reduce((aDouble, aDouble2) -> aDouble + aDouble2).get();
        System.out.println("购买图书总价：" + allPrice);
    }
}
