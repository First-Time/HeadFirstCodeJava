package chapter06.example6_10;

public class TestDemo {
    public static void main(String[] args) {
        try {   //div方法抛出异常，必须明确进行异常处理
            System.out.println(MyMath.div(10, 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
