package chapter09.example9_13;

public class TestDemo {
    public static void main(String[] args) throws Exception {
        MyThread mt = new MyThread();
        new Thread(mt, "自己的线程对象").start();
        mt.run();
    }
}
