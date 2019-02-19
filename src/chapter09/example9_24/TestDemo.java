package chapter09.example9_24;

import java.util.Timer;
import java.util.TimerTask;

public class TestDemo {
    public static void main(String[] args) throws Exception {
        MyThread my = new MyThread();
        new Thread(my, "线程").start();
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                my.stop();
            }
        }, 100);
    }
}
