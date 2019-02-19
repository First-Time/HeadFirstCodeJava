package chapter10.example10_6;

public class TestDemo {
    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer("Hello World MLDN");
        System.out.println(buf.delete(5, 11));
    }
}
