package chapter08.example8_50;

public class TestDemo {
    public static void main(String[] args) {
        IMessage<Integer, String> msg = String::valueOf;
        String str = msg.zhuanhuan(1000);
        System.out.println(str.replaceAll("0", "9"));
    }
}
