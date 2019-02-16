package chapter08.example8_55;

import java.util.function.Consumer;

public class TestDemo {
    public static void main(String[] args) {
        Consumer<String> cons = System.out::println;
        cons.accept("更多课程请访问：www.yootk.cn");
    }
}
