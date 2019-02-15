package chapter04.example4_41;

/**
 * 一个子类只能继承一个抽象类，属于单继承局限
 */
public class X extends A.B {                          //继承static内部抽象类
    @Override
    public void print() {
        System.out.println("更多课程请访问：www.yookt.com");
    }
}
