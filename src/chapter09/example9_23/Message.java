package chapter09.example9_23;

public class Message {
    private String title;
    private String content;
    private boolean flag = true;
    //flag == true:表示可以生产，但是不能取走
    //flag == false:表示可以取走，但是不能生产

    public synchronized void set(String title, String content) {
        if (this.flag == false) { //已经生产过了，不能生产
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.title = title;
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.content = content;
        this.flag = false;  // 已经生产完成，修改标志位
        super.notify();
    }

    public synchronized void get() {
        if (this.flag == true) {    //未生产，不能取走
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
        System.out.println(this.title + "-->" + this.content);
        this.flag = true;
        super.notify();
    }
}
