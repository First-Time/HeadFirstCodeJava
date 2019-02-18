package chapter09.synchronizedtest;

public class SynchronizedClass {

    public synchronized void synchronizedMethodA() {
        for (int x = 0; x < 50; x++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " synchronizedMethodA");
        }
    }

    public synchronized void synchronizedMethodB() {
        for (int x = 0; x < 50; x++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getClass().getName() + " synchronizedMethodB");
        }
    }

    public void generalMethod() {
        System.out.println("Invoke generalMethod");
    }
}
