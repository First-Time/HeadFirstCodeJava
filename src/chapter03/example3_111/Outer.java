package chapter03.example3_111;

public class Outer {
    private String msg = "Hello World!";

    public void fun() {
        class Inner {
            public void print() {
                System.out.println(Outer.this.msg);
            }
        }
        new Inner().print();
    }
}
