package chapter03.example3_103;

public class Outer {
    private String msg = "Hello World!";

    public class Inner {
        public void print() {
            System.out.println(msg);
        }
    }

    public void fun() {
        new Inner().print();
    }
}
