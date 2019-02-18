package chapter09.example9_14;

public class TestDemo {
    public static void main(String[] args) throws Exception {
        MyThread mt = new MyThread();
        new Thread(mt, "自己的线程对象A").start();
        new Thread(mt, "自己的线程对象B").start();
        new Thread(mt, "自己的线程对象C").start();
    }
}
