package chapter08.example8_47;

public class TestDemo {
    public static void main(String[] args) {
        fun((s1, s2) -> s1 + s2);
    }

    public static void fun(IMessage msg) {
        System.out.println(msg.add(10, 20));
    }
}
