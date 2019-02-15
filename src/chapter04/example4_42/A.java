package chapter04.example4_42;

/**
 * 在抽象类中，如果定义了static属性或方法时，就可以在没有对象的时候直接调用
 */
public abstract class A {                               //定义一个抽象类
    public static void print() {                        //static方法
        System.out.println("更多课程请访问：www.yootk.com");
    }
}
