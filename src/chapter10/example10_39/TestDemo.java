package chapter10.example10_39;

public class TestDemo {
    public static void main(String[] args) {
        String str = "10.10";
        String regex = "\\d+(\\.\\d+)?";
        if (str.matches(regex)) {
            System.out.println(Double.parseDouble(str));
        }
    }
}
