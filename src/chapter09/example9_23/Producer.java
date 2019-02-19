package chapter09.example9_23;

public class Producer implements Runnable {

    private Message msg;

    public Producer(Message msg) {
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
            if (x % 2 == 0) {
                msg.set("李兴华", "Java讲师");
            } else {
                msg.set("mldn", "www.mldnjava.cn");
            }
        }
    }
}
