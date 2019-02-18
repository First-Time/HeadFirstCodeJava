package chapter09.example9_11;

import java.util.concurrent.Callable;

public class MyThread implements Callable {
    private int ticket = 10;

    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public Object call() throws Exception {
        for (int x = 0; x < 50; x++) {
            if (this.ticket > 0) {
                System.out.println("买票，ticket = " + this.ticket--);
            }
        }
        return "票卖光了";
    }
}
