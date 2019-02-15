package chapter06.example6_14;

public class MyMath {
    public static int div(int x, int y) throws Exception {  //此方法不处理异常
        System.out.println("=====计算开始=====");
        int result;
        try {
            result = x / y;
        } catch (Exception e) {
            throw e;
        } finally {
            System.out.println("=====计算结束=====");
        }
        return result;
    }
}
