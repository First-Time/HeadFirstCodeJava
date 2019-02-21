package chapter10.exercises5_2;

import java.util.Random;

public class TestDemo {
    public static void main(String[] args) {
        Random random = new Random();
        for (int x = 0; x < 5; x++) {
            System.out.print(random.nextInt(30) + 1 + "、");
        }
    }
}
