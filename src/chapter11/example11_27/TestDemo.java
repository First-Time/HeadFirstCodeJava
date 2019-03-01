package chapter11.example11_27;

public class TestDemo {
    public static void main(String[] args) {
        try {
            Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.err.println(e);
        }
    }
}
