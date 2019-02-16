package chapter08.example8_54;

import java.util.function.Function;

public class TestDemo {
    public static void main(String[] args) {
        Function<String, Boolean> fun = "##yootk"::startsWith;
        System.out.println(fun.apply("##"));
    }
}
