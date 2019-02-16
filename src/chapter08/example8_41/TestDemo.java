package chapter08.example8_41;

public class TestDemo {
    public static void main(String[] args) {
        IMessage msg = new MessageImpl();
        msg.print();
        msg.fun();
    }
}
