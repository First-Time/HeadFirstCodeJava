package chapter04.example4_38;

/**
 * 一个子类只能继承一个抽象类，属于单继承局限
 */
public class B extends A {                          //B类是抽象类的子类，并且是一个普通类
    @Override
    public void print() {                           //强制要求覆写的方法
        System.out.println("Hello World！");
    }
}
