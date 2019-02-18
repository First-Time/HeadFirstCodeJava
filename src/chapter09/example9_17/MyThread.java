package chapter09.example9_17;

public class MyThread implements Runnable {
    private int ticket = 5;

    @Override
    public void run() {
        for (int x = 0; x < 20; x++) {
            if (this.ticket > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "买票，ticket = " + this.ticket--);
            }
        }
    }
}
