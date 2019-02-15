package chapter04.example4_54;

public class TestDemo {
    public static void main(String[] args) {
        /*X x = new X();
        A a = x;
        B b = x;
        a.print();
        ((X) a).get();
        b.get();
        ((X) b).print();
        System.out.println(A.MSG);*/

        A a = new X();
        B b = (B) a;
        ((X) b).print();

        System.out.println(a instanceof A);
        System.out.println(a instanceof B);
        System.out.println(b instanceof A);
        System.out.println(b instanceof B);
    }
}
