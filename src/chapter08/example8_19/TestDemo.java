package chapter08.example8_19;

import chapter08.example8_18.Message;

public class TestDemo {
    public static void main(String[] args) {
        Message<String> m = new Message<>();
        m.setMsg("www.yootk.com");
        fun(m);
    }

    private static void fun(Message<String> temp) {
        System.out.println(temp.getMsg());
    }
}
