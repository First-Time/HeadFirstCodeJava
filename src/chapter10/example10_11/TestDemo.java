package chapter10.example10_11;

import java.io.IOException;

public class TestDemo {
    public static void main(String[] args) throws IOException, InterruptedException {
        long start = System.currentTimeMillis();
        String str = "";
        for (int x = 0; x < 30000; x++) {
            str += x;
        }
        long end = System.currentTimeMillis();
        System.out.println("本次操作所花费的时间：" + (end - start));
    }
}
