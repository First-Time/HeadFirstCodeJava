package chapter09.example9_4;

public class MyThread implements Runnable {
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int x = 0; x < 200; x++) {
            System.out.println(this.name + "-->" + x);
        }
    }
}
