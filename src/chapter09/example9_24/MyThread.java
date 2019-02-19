package chapter09.example9_24;

public class MyThread implements Runnable {

    private boolean flag = true; //定义标志位属性

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
        int i = 0;
        while (this.flag) {
            System.out.println(Thread.currentThread().getName() + "运行，i = " + (i++));
        }
    }

    public void stop() {
        this.flag = false;
    }
}
