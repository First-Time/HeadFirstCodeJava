package chapter09.interrupttest;

public class InterruptionInJava implements Runnable {

    private volatile static boolean on = false;

    public static void main(String[] args) throws InterruptedException {
        Thread testThread = new Thread(new InterruptionInJava(), "InterruptionInJava");
        //start thread
        testThread.start();
        Thread.sleep(1000);

        InterruptionInJava.on = true;

        //interrupt thread
        testThread.interrupt();

        System.out.println("main end");



    }

    @Override
    public void run() {
        while (!on) {
            try {
                Thread.sleep(10000000);
            } catch (InterruptedException e) {
                System.out.println("caught exception: " + e);
            }

            /*if (Thread.currentThread().isInterrupted()) {
                System.out.println("Yes,I am interruted,but I am still running");
//                return;
            } else {
                System.out.println("not yet interrupted");
            }*/
        }
    }
}
