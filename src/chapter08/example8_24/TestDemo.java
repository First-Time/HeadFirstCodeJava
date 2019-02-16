package chapter08.example8_24;

public class TestDemo {
    public static void main(String[] args) {
        Message<Integer> m1 = new Message<>();
        m1.setMsg(100);
        fun(m1);
    }

    private static void fun(Message<? extends Number> temp) {
        System.out.println(temp.getMsg());
    }
}
