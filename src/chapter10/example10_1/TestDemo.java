package chapter10.example10_1;

public class TestDemo {
    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer();
        buf.append("Hello ").append("MLDN").append("!!");
        change(buf);
        System.out.println(buf);
    }

    private static void change(StringBuffer temp) {
        temp.append("\n").append("www.yootk.com");
    }
}
