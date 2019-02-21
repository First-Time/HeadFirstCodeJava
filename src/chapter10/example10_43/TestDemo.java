package chapter10.example10_43;

public class TestDemo {
    public static void main(String[] args) {
        String str = "a913696959@qq.com.cn";
//        String regex = "[0-9a-zA-Z]{8,10}@((\\d{3})|([a-z]{2}))\\.[a-z]{2,3}";
//        String regex = "\\w+@\\w+\\.\\w+";
        String regex = "[a-zA-Z][0-9a-zA-Z_.]{0,28}[0-9a-zA-Z]@\\w+\\.(com|net|cn|com\\.cn|net\\.cn|org|gov|edu)";
        System.out.println(str.matches(regex));
    }
}
