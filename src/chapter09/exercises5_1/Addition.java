package chapter09.exercises5_1;

public class Addition implements Runnable {

    private Message msg = null;

    public Addition(Message msg) {
        this.msg = msg;
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
            msg.add();
        }
    }
}
