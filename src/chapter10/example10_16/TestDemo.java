package chapter10.example10_16;

import java.util.Random;

public class TestDemo {
    public static void main(String[] args) {
        Random random = new Random();
        for (int x = 0; x < 10; x++) {
            System.out.print(random.nextInt(100) + "、");
        }
    }
}
