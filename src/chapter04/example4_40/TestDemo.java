package chapter04.example4_40;

public class TestDemo {
    public static void main(String[] args) {
        A a = new X();
        ((X) a).print();
        A.B y = new X().new Y();
        y.print();
    }
}
