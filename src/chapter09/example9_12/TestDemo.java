package chapter09.example9_12;

public class TestDemo {
    public static void main(String[] args) throws Exception {
        MyThread mt = new MyThread();
        new Thread(mt, "自己的线程A").start();
        new Thread(mt).start();
        new Thread(mt, "自己的线程B").start();
        new Thread(mt).start();
        new Thread(mt).start();
    }
}
