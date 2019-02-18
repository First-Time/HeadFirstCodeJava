package chapter09.example9_1;

public class MyThread extends Thread {
    private String name;

    /**
     * Allocates a new {@code Thread} object. This constructor has the same
     * effect as {@linkplain #Thread(ThreadGroup, Runnable, String) Thread}
     * {@code (null, null, name)}.
     *
     * @param name the name of the new thread
     */
    public MyThread(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void run() {
        for (int x = 0; x < 200; x++) {
            System.out.println(this.name + "-->" + x);
        }
    }
}
