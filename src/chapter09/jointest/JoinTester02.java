package chapter09.jointest;

public class JoinTester02 implements Runnable {

    Thread thread;

    public JoinTester02(Thread thread) {
        this.thread = thread;
    }

    public void run() {
        synchronized (thread) {
            System.out.println("getObjectLock");

            try {
                thread.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println("ReleaseObjectLock");
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new JoinTester01("Three"));
        Thread getLockThread = new Thread(new JoinTester02(thread));

        getLockThread.start();
        thread.start();

        /*try {
            thread.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/

        System.out.println("Main finished!");
    }

}
