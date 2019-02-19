package chapter09.exercises5_1;

public class TestDemo {
    public static void main(String[] args) {
        Message msg = new Message();
        new Thread(new Addition(msg), "加法对象A").start();
        new Thread(new Addition(msg), "加法对象B").start();
        new Thread(new Subtraction(msg), "减法对象A").start();
        new Thread(new Subtraction(msg), "减法对象B").start();
    }
}
