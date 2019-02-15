package chapter04.example4_31;

public class TestDemo {
    public static void main(String[] args) {
        fun(new B());
        fun(new C());
    }

    private static void fun(A a) {
        a.print();
    }
}
