package chapter06.example6_18;

public class TestDemo {
    public static void main(String[] args) {
        int num = 20;
        try {
            if (num > 10) {
                throw new AddException("数值传递的过大！");
            }
        } catch (AddException e) {
            e.printStackTrace();
        }
    }
}
