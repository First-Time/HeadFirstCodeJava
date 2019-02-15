package chapter06.example6_13;

public class TestDemo {
    public static void main(String[] args) {
        try {
            throw new Exception("自己定义的异常！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
