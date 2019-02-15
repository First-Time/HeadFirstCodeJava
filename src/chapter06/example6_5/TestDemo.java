package chapter06.example6_5;

public class TestDemo {
    public static void main(String[] args) {
        System.out.println("1、除法计算开始。");
        try {
            System.out.println("2、除法计算：" + (10 / 0));
            System.out.println("更多课程请访问：www.yootk.com");
        } catch (ArithmeticException e) {
            System.out.println("*****出现异常了*****");
            e.printStackTrace();
        } finally {
            System.out.println("###不管是否出现异常，我都执行！");
        }
        System.out.println("3、除法计算结束。");
    }
}
