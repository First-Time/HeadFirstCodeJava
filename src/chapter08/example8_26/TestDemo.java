package chapter08.example8_26;

public class TestDemo {
    public static void main(String[] args) {
        String str = fun("www.yootk.com");
        System.out.println(str.length());
    }

    private static <T> T fun(T t) {
        return t;
    }
}
