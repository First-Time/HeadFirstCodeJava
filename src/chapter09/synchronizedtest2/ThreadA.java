package chapter09.synchronizedtest2;

public class ThreadA implements Runnable {

    private SynchronizedClass synchronizedClassA;

    public ThreadA(SynchronizedClass synchronizedClassA) {
        this.synchronizedClassA = synchronizedClassA;
    }

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        for (int x = 0; x < 50; x++) {
            synchronizedClassA.synchronizedMethodA();
        }
    }
}
