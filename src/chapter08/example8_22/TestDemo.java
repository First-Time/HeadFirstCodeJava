package chapter08.example8_22;

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

    private static void fun(Message temp) {
        temp.setMsg("魔乐科技软件学院：www.mldn.cn");
        System.out.println(temp.getMsg());
    }
}
