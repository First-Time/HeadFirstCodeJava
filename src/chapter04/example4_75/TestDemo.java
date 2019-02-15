package chapter04.example4_75;

public class TestDemo {
    public static void main(String[] args) {
        A a = new B();
        a.fun();
        System.out.println(a);

        B b = new B();
        b.fun();
        System.out.println(b);

        Object obj = a;
        System.out.println(obj);
        A t = (A) obj;
        t.fun();
        System.out.println(t);
    }
}
