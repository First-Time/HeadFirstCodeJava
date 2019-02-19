package chapter10.example10_5;

public class TestDemo {
    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer("yootk");
        buf.insert(0, "www.").insert(9, ".com");
        System.out.println(buf);
    }
}
