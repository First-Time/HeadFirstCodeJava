package chapter03.example3_107;

public class Outer {
    private String msg = "Hello World!";

    public class Inner {
        public void print() {
            System.out.println(Outer.this.msg);
        }
    }
}
