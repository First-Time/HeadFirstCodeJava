package chapter08.example8_49;

public class TestDemo {
    public static void main(String[] args) {
        fun((int... param) -> IMessage.sum(param));
    }

    public static void fun(IMessage msg) {
//        System.out.println(msg.add(10, 20));
        System.out.println("123");
    }
}
