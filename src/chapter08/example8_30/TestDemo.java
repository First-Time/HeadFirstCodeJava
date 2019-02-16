package chapter08.example8_30;

public class TestDemo {
    public static void main(String[] args) {
        for (Color c : Color.values()) {
            System.out.println(c.ordinal() + "-" + c.name());
        }
    }
}
