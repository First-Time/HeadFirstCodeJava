package chapter08.example8_23;

public class TestDemo {
    public static void main(String[] args) {
        Message<String> m1 = new Message<>();
        m1.setMsg("更多课程请访问：www.yootk.com");
        fun(m1);
    }

    private static void fun(Message<? super String> temp) {
        System.out.println(temp.getMsg());
    }
}
