package chapter09.example9_20;

public class TestDemo implements Runnable {
    private static A a = new A();
    private static B b = new B();

    public static void main(String[] args) {
        new TestDemo();
    }

    public TestDemo() {
        new Thread(this).start();
        b.say(a);
    }

    @Override
    public void run() {
        a.say(b);
    }
}
