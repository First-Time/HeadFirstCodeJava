package chapter09.example9_16;

public class TestDemo {
    public static void main(String[] args) throws Exception {
        //主线程线程优先级为5
        System.out.println(Thread.currentThread().getPriority());
    }
}
