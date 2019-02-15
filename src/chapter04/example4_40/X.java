package chapter04.example4_40;

/**
 * 一个子类只能继承一个抽象类，属于单继承局限
 */
public class X extends A {                          //抽象类必须有子类
    public void print() {
        System.out.println("更多课程请访问：www.yookt.com");
    }

    class Y extends B {                             //定义内部抽象类的子类，此类不是必须编写

        @Override
        public void print() {
            System.out.println("刘燕霏");           //方法覆写
        }
    }
}
