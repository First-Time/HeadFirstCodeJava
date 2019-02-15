package chapter06.example6_12;

public class TestDemo {
    public static void main(String[] args) throws Exception {
        //div方法抛出异常，必须明确进行异常处理
        System.out.println(MyMath.div(10, 0));
    }
}
