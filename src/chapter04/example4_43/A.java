package chapter04.example4_43;

/**
 *
 */
public abstract class A {                               //定义一个抽象类
    public abstract void print();                       //定义抽象方法

    private static class B extends A {
        @Override
        public void print() {
            System.out.println("更多课程请访问：www.yookt.com");
        }
    }

    public static A getInstance() {
        return new B();
    }
}
