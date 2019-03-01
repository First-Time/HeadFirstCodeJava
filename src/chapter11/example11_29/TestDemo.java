package chapter11.example11_29;

import java.util.function.Consumer;

public class TestDemo {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("更多课程请访问：www.yootk.com");
    }
}
