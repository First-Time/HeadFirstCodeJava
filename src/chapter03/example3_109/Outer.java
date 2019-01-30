package chapter03.example3_109;

public class Outer {
    private static String msg = "Hello World!";

    public static class Inner {
        public void print() {
            System.out.println(Outer.msg);
        }
    }
}
