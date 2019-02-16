package chapter08.example8_52;

public class TestDemo {
    public static void main(String[] args) {
        IMessage<String> msg = "yootk"::toUpperCase;
        System.out.println(msg.upper());
    }
}
