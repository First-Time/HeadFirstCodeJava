package chapter06.example6_15;

public class TestDemo {
    public static void main(String[] args) {
        try {
            System.out.println(MyMath.div(10, 0));  //被调用处处理异常
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
