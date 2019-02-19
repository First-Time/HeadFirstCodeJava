package chapter10.example10_12;

import java.io.IOException;

public class TestDemo {
    public static void main(String[] args) {
        Human human = new Human();
        human = null;
        System.gc();
    }
}
