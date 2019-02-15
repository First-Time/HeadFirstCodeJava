package chapter04.example4_84;

public class TestDemo {
    public static void main(String[] args) {
        fun(new Message() {
            @Override
            public void print() {
                System.out.println("Hello World！");
            }
        });
    }

    private static void fun(Message msg) {
        msg.print();
    }
}
