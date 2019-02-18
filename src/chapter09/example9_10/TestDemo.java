package chapter09.example9_10;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestDemo {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        FutureTask<String> futureTask = new FutureTask<String>(mt);
        futureTask.run();
        try {
            System.out.println(futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
