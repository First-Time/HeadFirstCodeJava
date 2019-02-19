package chapter09.example9_22;

public class Message {
    private String title;
    private String content;

    public synchronized void set(String title, String content) {
        this.title = title;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.content = content;
        System.out.println("set:" + this.title + "-->" + this.content);
    }

    public synchronized void get() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("get:" + this.title + "-->" + this.content);
    }
}
