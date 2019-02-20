package chapter10.example10_37;

public class TestDemo {
    public static void main(String[] args) {
        String str = "hello*)(*()yootk(*#mldn*";
        String regex = "[^a-z]";
        System.out.println(str.replaceAll(regex, ""));
    }
}
