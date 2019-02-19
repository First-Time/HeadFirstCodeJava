package chapter09.synchronizedtest2;

public class SynchronizedClass {

    public synchronized void synchronizedMethodA() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " synchronizedMethodA");
    }

    public synchronized void synchronizedMethodB() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getClass().getName() + " synchronizedMethodB");
    }

    public void generalMethod() {
        System.out.println("Invoke generalMethod");
    }
}
