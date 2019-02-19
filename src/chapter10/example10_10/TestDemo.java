package chapter10.example10_10;

import java.io.IOException;

public class TestDemo {
    public static void main(String[] args) throws IOException, InterruptedException {
        Runtime run = Runtime.getRuntime();
        Process pro = run.exec("javac");
//        Thread.sleep(2000);
//        pro.destroy();
    }
}
