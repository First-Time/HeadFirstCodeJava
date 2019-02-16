package chapter08.example8_56;

import java.util.function.Supplier;

public class TestDemo {
    public static void main(String[] args) {
        Supplier<String> sup = "yootk"::toUpperCase;
        System.out.println(sup.get());
    }
}
