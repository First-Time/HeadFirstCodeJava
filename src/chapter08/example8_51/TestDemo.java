package chapter08.example8_51;

public class TestDemo {
    public static void main(String[] args) {
        IMessage<String> msg = String::compareTo;
        System.out.println(msg.compare("A", "B"));
    }
}
