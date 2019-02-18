package chapter09.example9_15;

public class TestDemo {
    public static void main(String[] args) throws Exception {
        MyThread mt = new MyThread();
        Thread t1 = new Thread(mt, "自己的线程对象A");
        Thread t2 = new Thread(mt, "自己的线程对象B");
        Thread t3 = new Thread(mt, "自己的线程对象C");
        Thread t4 = new Thread(mt, "自己的线程对象D");
        Thread t5 = new Thread(mt, "自己的线程对象E");
        Thread t6 = new Thread(mt, "自己的线程对象F");
        Thread t7 = new Thread(mt, "自己的线程对象G");
        Thread t8 = new Thread(mt, "自己的线程对象H");
        Thread t9 = new Thread(mt, "自己的线程对象I");
        Thread t10 = new Thread(mt, "自己的线程对象J");
        Thread t11 = new Thread(mt, "自己的线程对象K");
        Thread t12 = new Thread(mt, "自己的线程对象L");
        Thread t13 = new Thread(mt, "自己的线程对象M");
        Thread t14 = new Thread(mt, "自己的线程对象N");
        Thread t15 = new Thread(mt, "自己的线程对象O");
        t10.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        t11.start();
        t12.start();
        t13.start();
        t14.start();
        t15.start();
    }
}
