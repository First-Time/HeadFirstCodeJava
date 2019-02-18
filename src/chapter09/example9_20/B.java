package chapter09.example9_20;

public class B {
    public synchronized void say(A a) {
        System.out.println("B先生说：把你的本给我，我给你笔，否则不给！");
        a.get();
    }

    public synchronized void get() {
        System.out.println("B先生：得到了本，付出了笔，还是什么都干不了！");
    }
}
