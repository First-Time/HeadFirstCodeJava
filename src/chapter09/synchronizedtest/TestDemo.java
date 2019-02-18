package chapter09.synchronizedtest;

public class TestDemo {
    public static void main(String[] args) {
        SynchronizedClass synchronizedClass = new SynchronizedClass();
        ThreadA threadA = new ThreadA(synchronizedClass);
        ThreadB threadB = new ThreadB(synchronizedClass);
        new Thread(threadA).start();
        new Thread(threadB).start();
    }
}
