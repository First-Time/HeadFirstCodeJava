package chapter06.example6_17;

public class TestDemo {
    public static void main(String[] args) {
        int num = 10;
        assert num == 20 : "num的内容不是20";
        System.out.println("num = " + num);
    }
}
