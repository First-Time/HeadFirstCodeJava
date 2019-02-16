package chapter08.example8_43;

public class TestDemo {
    public static void main(String[] args) {
        fun(() -> System.out.println("更多课程请访问：www.yootk.cn"));
        fun(new IMessage() {
            @Override
            public void print() {
                System.out.println("更多课程请访问：www.yootk.cn");
            }
        });
    }

    public static void fun(IMessage msg) {
        msg.print();
    }
}
