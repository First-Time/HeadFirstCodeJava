package chapter08.example8_46;

public class TestDemo {
    public static void main(String[] args) {
        String info = "魔乐科技软件学院：www.mldn.cn";
        fun(() -> {
            System.out.println("更多课程请访问：www.yootk.cn");
            System.out.println(info);
        });
    }

    public static void fun(IMessage msg) {
        msg.print();
    }
}
