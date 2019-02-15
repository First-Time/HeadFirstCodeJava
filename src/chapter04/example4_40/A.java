package chapter04.example4_40;

/**
 * 抽象类中依然可以定义内部的抽象类，而实现的子类也可以根据需要选择是否定义内部类来继承抽象内部类。
 */
public abstract class A {                               //定义一个抽象类
    abstract class B {                                  //定义内部抽象类
        public abstract void print();
    }
}
