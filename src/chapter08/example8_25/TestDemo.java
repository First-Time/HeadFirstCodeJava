package chapter08.example8_25;

public class TestDemo {
    public static void main(String[] args) {
        IMessage<String> msg = new MessageImpl();
        msg.print("更多课程请访问：www.yootk.com");
    }
}
