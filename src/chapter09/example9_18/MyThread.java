package chapter09.example9_18;

public class MyThread implements Runnable {
    private int ticket = 10000;

    @Override
    public void run() {
        for (int x = 0; x < 10000; x++) {
            synchronized (this) {
                if (this.ticket > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "买票，ticket = " + this.ticket--);
                }
            }
        }
    }
}
