package chapter08.example8_21;

import chapter08.example8_18.Message;

public class TestDemo {
    public static void main(String[] args) {
        Message<String> m1 = new Message<>();
        m1.setMsg("www.yootk.com");
        fun(m1);

        Message<Integer> m2 = new Message<>();
        m2.setMsg(30);
        fun(m2);
    }

    private static void fun(Message<?> temp) {
        System.out.println(temp.getMsg());
    }
}
