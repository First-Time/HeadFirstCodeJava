package chapter10.example10_40;

public class TestDemo {
    public static void main(String[] args) {
        String str = "192.168.1.1";
//        String regex = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";
        String regex = "(\\d{1,3}\\.){3}\\d{1,3}";
        System.out.println(str.matches(regex));
    }
}
