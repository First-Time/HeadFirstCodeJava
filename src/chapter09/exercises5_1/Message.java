package chapter09.exercises5_1;

public class Message {
    private int data = 10;
    private boolean flag = true;

    public synchronized void add() {
        if (this.flag == false) {
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("加法操作：" + Thread.currentThread().getName() + "-->" + ++this.data);
        this.flag = false;
        super.notifyAll();
    }

    public synchronized void subtract() {
        if (this.flag == true) {
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("减法操作：" + Thread.currentThread().getName() + "-->" + --this.data);
        this.flag = true;
        super.notifyAll();
    }
}
