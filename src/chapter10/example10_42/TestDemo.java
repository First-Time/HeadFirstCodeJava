package chapter10.example10_42;

public class TestDemo {
    public static void main(String[] args) {
//        String str = "(010)-51283346";
        String str = "010-51283346";
//        String regex = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";
        String regex = "((\\d{3}-)|(\\(\\d{3}\\)-))?\\d{7,8}";
        System.out.println(str.matches(regex));
    }
}
