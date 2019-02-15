package chapter04.example4_35;

public class TestDemo {
    public static void main(String[] args) {
        fun(new B());
    }

    private static void fun(A a) {
        a.print();
        if (a instanceof B) {
            B b = (B) a;
            b.funB();
        }
    }
}
