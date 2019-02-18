package chapter09.example9_20;

public class A {
    public synchronized void say(B b) {
        System.out.println("A先生说：把你的本给我，我给你笔，否则不给！");
        b.get();
    }

    public synchronized void get() {
        System.out.println("A先生：得到了本，付出了笔，还是什么都干不了！");
    }
}
