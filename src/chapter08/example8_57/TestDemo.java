package chapter08.example8_57;

import java.util.function.Predicate;

public class TestDemo {
    public static void main(String[] args) {
        Predicate<String> pre = "yootk"::equalsIgnoreCase;
        System.out.println(pre.test("YOOTK"));
    }
}
