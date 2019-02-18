package chapter09.example9_11;

import java.util.concurrent.FutureTask;

public class TestDemo {
    public static void main(String[] args) throws Exception {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        FutureTask<String> task1 = new FutureTask<String>(mt1);
        FutureTask<String> task2 = new FutureTask<String>(mt2);
        new Thread(task1).start();
        new Thread(task2).start();
        System.out.println("A线程的返回结果：" + task1.get());
        System.out.println("B线程的返回结果：" + task2.get());
    }
}
