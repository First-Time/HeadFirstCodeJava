package chapter09.example9_2;

import chapter09.example9_1.MyThread;

public class TestDemo {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread("线程A");
        MyThread mt2 = new MyThread("线程B");
        MyThread mt3 = new MyThread("线程C");
        mt1.start();
        mt1.start();
        mt2.start();
        mt3.start();
    }
}
